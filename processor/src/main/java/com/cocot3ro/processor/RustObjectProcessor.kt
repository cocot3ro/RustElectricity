package com.cocot3ro.processor

import androidx.compose.ui.geometry.Offset
import com.cocot3ro.rustelectricity.annotations.Blueprint
import com.cocot3ro.rustelectricity.annotations.Deployable
import com.cocot3ro.rustelectricity.annotations.DoorControllerAttachable
import com.cocot3ro.rustelectricity.annotations.ElectricalComponent
import com.cocot3ro.rustelectricity.annotations.ElectricalTool
import com.cocot3ro.rustelectricity.annotations.IndustrialComponent
import com.cocot3ro.rustelectricity.annotations.IndustrialTool
import com.cocot3ro.rustelectricity.annotations.ItemDoorController
import com.cocot3ro.rustelectricity.annotations.ItemStorageAdaptor
import com.cocot3ro.rustelectricity.annotations.ItemStorageMonitor
import com.cocot3ro.rustelectricity.annotations.RustObject
import com.cocot3ro.rustelectricity.annotations.StorageAdaptorAttachable
import com.cocot3ro.rustelectricity.annotations.StorageMonitorAttachable
import com.cocot3ro.rustelectricity.annotations.WaterComponent
import com.cocot3ro.rustelectricity.annotations.WaterTool
import com.cocot3ro.rustelectricity.interfaces.IBlueprint
import com.cocot3ro.rustelectricity.interfaces.IDeployable
import com.cocot3ro.rustelectricity.interfaces.IDoorControllerAttachable
import com.cocot3ro.rustelectricity.interfaces.IElectricalComponent
import com.cocot3ro.rustelectricity.interfaces.IElectricalPlug
import com.cocot3ro.rustelectricity.interfaces.IElectricalTool
import com.cocot3ro.rustelectricity.interfaces.IIndustrialComponent
import com.cocot3ro.rustelectricity.interfaces.IIndustrialPlug
import com.cocot3ro.rustelectricity.interfaces.IIndustrialTool
import com.cocot3ro.rustelectricity.interfaces.IItemDoorController
import com.cocot3ro.rustelectricity.interfaces.IItemStorageAdaptor
import com.cocot3ro.rustelectricity.interfaces.IItemStorageMonitor
import com.cocot3ro.rustelectricity.interfaces.IStorageAdaptorAttachable
import com.cocot3ro.rustelectricity.interfaces.IStorageMonitorAttachable
import com.cocot3ro.rustelectricity.interfaces.IWaterComponent
import com.cocot3ro.rustelectricity.interfaces.IWaterPlug
import com.cocot3ro.rustelectricity.interfaces.IWaterTool
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSAnnotation
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSType
import com.google.devtools.ksp.symbol.KSValueArgument
import com.google.devtools.ksp.symbol.KSVisitorVoid
import com.google.devtools.ksp.validate
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.asTypeName
import com.squareup.kotlinpoet.ksp.toClassName
import com.squareup.kotlinpoet.ksp.writeTo
import java.lang.reflect.Field
import kotlin.reflect.KClass

class RustObjectProcessor(
    private val codeGenerator: CodeGenerator
) : SymbolProcessor {

    override fun process(resolver: Resolver): List<KSAnnotated> {

        val symbol = resolver
            .getSymbolsWithAnnotation(RustObject::class.qualifiedName!!)
            .filterIsInstance<KSClassDeclaration>()
            .firstOrNull()

        if (symbol == null) return emptyList()

        val codeBlock: CodeBlock.Builder = CodeBlock.builder()
        val rustObjectExtensionVisitor = RustObjectExtensionVisitor(codeBlock)

        val implementations =
            (symbol.annotations.first {
                it.shortName.asString() == RustObject::class.simpleName
            }.arguments.first().value as ArrayList<*>)
                .map { it as KSType }

        implementations.forEach { impl: KSType ->

            val builder = impl.toClassName().let { className: ClassName ->
                FileSpec.builder(
                    packageName = className.packageName,
                    fileName = "${className.simpleName}Impl"
                )
            }

            impl.declaration.accept(RustObjectImplVisitor(builder), Unit)
            impl.declaration.accept(rustObjectExtensionVisitor, Unit)

            builder.build().writeTo(codeGenerator, false)
        }

        val helperClass = symbol.toClassName().let {
            ClassName(it.packageName, "${it.simpleName}s")
        }

        FileSpec.builder(
            packageName = helperClass.packageName,
            fileName = helperClass.simpleName
        )
            .addProperty(
                PropertySpec.builder(
                    "deployables",
                    Array::class.asClassName().parameterizedBy(symbol.toClassName())
                )
                    .receiver(
                        helperClass.nestedClass("Companion")
                    )
                    .delegate(
                        CodeBlock.builder()
                            .beginControlFlow("lazy")
                            .addStatement("arrayOf(")
                            .indent()
                            .add(codeBlock.build())
                            .unindent()
                            .addStatement(")")
                            .endControlFlow()
                            .build()
                    )
                    .build()
            )
            .build()
            .writeTo(codeGenerator, false)

        return listOf(symbol).filterNot { it.validate() }.toList()
    }

    inner class RustObjectExtensionVisitor(
        private val codeBlock: CodeBlock.Builder
    ) : KSVisitorVoid() {

        override fun visitClassDeclaration(classDeclaration: KSClassDeclaration, data: Unit) {
            if (classDeclaration.annotations.any { it.shortName.asString() == Deployable::class.simpleName })
                codeBlock.addStatement("${classDeclaration.simpleName.asString()}Impl(),")
        }

    }

    inner class RustObjectImplVisitor(
        private val fileSpec: FileSpec.Builder
    ) : KSVisitorVoid() {

        private lateinit var classBuilder: TypeSpec.Builder
        private val constructorBuilder: FunSpec.Builder = FunSpec.constructorBuilder()

        private var isObject = true

        private fun getClassBuilder(classDeclaration: KSClassDeclaration): TypeSpec.Builder {
            val className = "${classDeclaration.simpleName.asString()}Impl"

            return if (classDeclaration.annotations.none()) {
                TypeSpec.objectBuilder(className)
            } else if (
                classDeclaration.annotations.any {
                    it.shortName.asString() in arrayOf(
                        Deployable::class.simpleName,

                        DoorControllerAttachable::class.simpleName,
                        StorageAdaptorAttachable::class.simpleName,
                        StorageMonitorAttachable::class.simpleName,

                        ElectricalComponent::class.simpleName,
                        IndustrialComponent::class.simpleName,
                        WaterComponent::class.simpleName,

                        ElectricalTool::class.simpleName,
                        IndustrialTool::class.simpleName,
                        WaterTool::class.simpleName
                    )
                }
            ) {
                isObject = false
                TypeSpec.classBuilder(className)
            } else {
                TypeSpec.objectBuilder(className)
            }.addModifiers(KModifier.DATA).also {
                classBuilder = it
            }
        }

        override fun visitClassDeclaration(classDeclaration: KSClassDeclaration, data: Unit) {
            fileSpec.addType(
                getClassBuilder(classDeclaration)
                    .apply {
                        classDeclaration.annotations.forEach { annotation: KSAnnotation ->
                            visitAnnotation(annotation, Unit)
                        }
                    }
                    .superclass(classDeclaration.toClassName())
                    .apply { if (!isObject) primaryConstructor(constructorBuilder.build()) }
                    .build()
            )
        }

        override fun visitAnnotation(annotation: KSAnnotation, data: Unit) {

            val klass: KClass<*> = when (annotation.shortName.asString()) {
                Blueprint::class.simpleName -> {
                    IBlueprint::class
                }

                Deployable::class.simpleName -> {
                    constructorBuilder.addParameter(
                        ParameterSpec.builder(
                            IDeployable::position.name,
                            IDeployable::position.returnType.asTypeName()
                        )
                            .defaultValue("Offset.Zero")
                            .build()
                    )

                    classBuilder.addProperty(
                        PropertySpec.builder(
                            IDeployable::position.name,
                            IDeployable::position.returnType.asTypeName()
                        )
                            .initializer(IDeployable::position.name)
                            .mutable()
                            .addModifiers(KModifier.OVERRIDE)
                            .build()
                    )

                    IDeployable::class
                }

                ItemDoorController::class.simpleName -> {
                    IItemDoorController::class
                }

                DoorControllerAttachable::class.simpleName -> {
                    constructorBuilder.addParameter(
                        ParameterSpec.builder(
                            IDoorControllerAttachable::doorController.name,
                            IDoorControllerAttachable::doorController.returnType.asTypeName()
                        )
                            .defaultValue("null")
                            .build()
                    )

                    classBuilder.addProperty(
                        PropertySpec.builder(
                            IDoorControllerAttachable::doorController.name,
                            IDoorControllerAttachable::doorController.returnType.asTypeName()
                        )
                            .initializer(IDoorControllerAttachable::doorController.name)
                            .mutable()
                            .addModifiers(KModifier.OVERRIDE)
                            .build()
                    )

                    IDoorControllerAttachable::class
                }

                ElectricalComponent::class.simpleName -> {
                    annotation.arguments.forEach { arg: KSValueArgument ->
                        visitValueArgument(arg, Unit)
                    }
                    IElectricalComponent::class
                }

                ElectricalTool::class.simpleName -> {
                    IElectricalTool::class
                }

                IndustrialComponent::class.simpleName -> {
                    annotation.arguments.forEach { arg: KSValueArgument ->
                        visitValueArgument(arg, Unit)
                    }
                    IIndustrialComponent::class
                }

                IndustrialTool::class.simpleName -> {
                    IIndustrialTool::class
                }

                ItemStorageAdaptor::class.simpleName -> {
                    IItemStorageAdaptor::class
                }

                StorageAdaptorAttachable::class.simpleName -> {
                    annotation.arguments.forEach { arg: KSValueArgument ->
                        visitValueArgument(arg, Unit)
                    }
                    IStorageAdaptorAttachable::class
                }

                ItemStorageMonitor::class.simpleName -> {
                    IItemStorageMonitor::class
                }

                StorageMonitorAttachable::class.simpleName -> {
                    constructorBuilder.addParameter(
                        ParameterSpec.builder(
                            IStorageMonitorAttachable::storageMonitor.name,
                            IStorageMonitorAttachable::storageMonitor.returnType.asTypeName()
                        )
                            .defaultValue("null")
                            .build()
                    )

                    classBuilder.addProperty(
                        PropertySpec.builder(
                            IStorageMonitorAttachable::storageMonitor.name,
                            IStorageMonitorAttachable::storageMonitor.returnType.asTypeName()
                        )
                            .initializer(IStorageMonitorAttachable::storageMonitor.name)
                            .mutable()
                            .addModifiers(KModifier.OVERRIDE)
                            .build()
                    )

                    IStorageMonitorAttachable::class
                }

                WaterComponent::class.simpleName -> {
                    annotation.arguments.forEach { arg: KSValueArgument ->
                        visitValueArgument(arg, Unit)
                    }
                    IWaterComponent::class
                }

                WaterTool::class.simpleName -> {
                    IWaterTool::class
                }

                else -> throw IllegalArgumentException("Unknown annotation: ${annotation.shortName}")
            }

            classBuilder.addSuperinterface(klass)
            klass.java.declaredFields.forEach { field: Field ->
                constructorBuilder.addParameter(field.name, field.type)
                classBuilder.addProperty(
                    PropertySpec.builder(field.name, field.type)
                        .initializer(field.name)
                        .mutable()
                        .addModifiers(KModifier.OVERRIDE)
                        .build()
                )
            }

            if (klass == IElectricalTool::class || klass == IIndustrialTool::class || klass == IWaterTool::class) {
                val (
                    plugA,
                    plugB,
                    positions
                ) = when (klass) {
                    IElectricalTool::class -> Triple(
                        IElectricalTool::plugA,
                        IElectricalTool::plugB,
                        IElectricalTool::positions
                    )

                    IIndustrialTool::class -> Triple(
                        IIndustrialTool::plugA,
                        IIndustrialTool::plugB,
                        IIndustrialTool::positions
                    )

                    IWaterTool::class -> Triple(
                        IWaterTool::plugA,
                        IWaterTool::plugB,
                        IWaterTool::positions
                    )

                    else -> throw IllegalArgumentException("Unknown tool: $klass")
                }

                constructorBuilder.addParameters(
                    listOf(
                        ParameterSpec.builder(
                            plugA.name,
                            plugA.returnType.asTypeName()
                        )
                            .defaultValue("null")
                            .build(),

                        ParameterSpec.builder(
                            plugB.name,
                            plugB.returnType.asTypeName()
                        )
                            .defaultValue("null")
                            .build(),

                        ParameterSpec.builder(
                            positions.name,
//                            positions.returnType.asTypeName(). It replaces MutableList with List
                            MutableList::class.parameterizedBy(Offset::class).rawType.let { typeName: ClassName ->
                                ClassName(typeName.packageName, "Mutable${typeName.simpleName}")
                                    .parameterizedBy(Offset::class.asTypeName())
                            }
                        )
                            .defaultValue("mutableListOf()")
                            .build()
                    )
                )

                classBuilder.addProperties(
                    listOf(
                        PropertySpec.builder(
                            plugA.name,
                            plugA.returnType.asTypeName()
                        )
                            .initializer(plugA.name)
                            .mutable()
                            .addModifiers(KModifier.OVERRIDE)
                            .build(),

                        PropertySpec.builder(
                            plugB.name,
                            plugB.returnType.asTypeName()
                        )
                            .initializer(plugB.name)
                            .mutable()
                            .addModifiers(KModifier.OVERRIDE)
                            .build(),

                        PropertySpec.builder(
                            positions.name,
//                                positions.returnType.asTypeName()
                            MutableList::class.parameterizedBy(Offset::class).rawType.let { typeName: ClassName ->
                                ClassName(typeName.packageName, "Mutable${typeName.simpleName}")
                                    .parameterizedBy(Offset::class.asTypeName())
                            }
                        )
                            .initializer(positions.name)
                            .mutable()
                            .addModifiers(KModifier.OVERRIDE)
                            .build()
                    )
                )
            }
        }

        override fun visitValueArgument(valueArgument: KSValueArgument, data: Unit) {
            when (val argumentName = valueArgument.name?.asString()) {
                null -> throw IllegalArgumentException("Value argument name is null")

                StorageAdaptorAttachable::slotAmount.name -> {
                    constructorBuilder.addParameter(
                        ParameterSpec.builder(
                            IStorageAdaptorAttachable::adaptors.name,
                            IStorageAdaptorAttachable::adaptors.returnType.asTypeName()
                        )
                            .defaultValue(
                                CodeBlock.builder()
                                    .addStatement("arrayOfNulls<${IItemStorageAdaptor::class.simpleName}>(${valueArgument.value as Int})")
                                    .build()
                            )
                            .build()
                    )

                    classBuilder.addProperty(
                        PropertySpec.builder(
                            IStorageAdaptorAttachable::adaptors.name,
                            IStorageAdaptorAttachable::adaptors.returnType.asTypeName()
                        )
                            .addModifiers(KModifier.OVERRIDE)
                            .initializer(IStorageAdaptorAttachable::adaptors.name)
                            .mutable()
                            .build()
                    )
                }

                ElectricalComponent::electricalInputs.name,
                ElectricalComponent::electricalOutputs.name,
                IndustrialComponent::industrialInputs.name,
                IndustrialComponent::industrialOutputs.name,
                WaterComponent::waterInputs.name,
                WaterComponent::waterOutputs.name -> {

                    val (
                        property,
                        plugClass
                    ) = when (argumentName) {
                        ElectricalComponent::electricalInputs.name -> IElectricalComponent::electricalInputs to IElectricalPlug::class
                        ElectricalComponent::electricalOutputs.name -> IElectricalComponent::electricalOutputs to IElectricalPlug::class

                        IndustrialComponent::industrialInputs.name -> IIndustrialComponent::industrialInputs to IIndustrialPlug::class
                        IndustrialComponent::industrialOutputs.name -> IIndustrialComponent::industrialOutputs to IIndustrialPlug::class

                        WaterComponent::waterInputs.name -> IWaterComponent::waterInputs to IWaterPlug::class
                        WaterComponent::waterOutputs.name -> IWaterComponent::waterOutputs to IWaterPlug::class

                        else -> throw IllegalArgumentException("Unknown value argument: $argumentName")
                    }

                    constructorBuilder.addParameter(
                        ParameterSpec.builder(
                            property.name,
                            property.returnType.asTypeName()
                        )
                            .defaultValue(
                                CodeBlock.builder()
                                    .apply {
                                        (valueArgument.value as ArrayList<*>)
                                            .map { it as KSType }
                                            .let { inputs: List<KSType> ->
                                                if (inputs.isEmpty()) {
                                                    addStatement("emptyArray<${plugClass.simpleName}>()")
                                                } else {
                                                    addStatement("arrayOf<${plugClass.simpleName}>(")
                                                    indent()
                                                    inputs.forEachIndexed { idx, it ->
                                                        addStatement("${it.toClassName().simpleName}()${if (idx != inputs.lastIndex) "," else ""}")
                                                    }
                                                    unindent()
                                                    add(")")
                                                }
                                            }
                                    }
                                    .build()
                            )
                            .build()
                    )

                    classBuilder.addProperty(
                        PropertySpec.builder(
                            property.name,
                            property.returnType.asTypeName()
                        )
                            .addModifiers(KModifier.OVERRIDE)
                            .initializer(property.name)
                            .mutable()
                            .build()
                    )
                }

                else -> throw IllegalArgumentException("Unknown value argument: ${valueArgument.name}")
            }
        }
    }
}
