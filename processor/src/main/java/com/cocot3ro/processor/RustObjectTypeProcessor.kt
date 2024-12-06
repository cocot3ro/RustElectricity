package com.cocot3ro.processor

import com.cocot3ro.annotations.Deployable
import com.cocot3ro.annotations.DoorControllerAttachable
import com.cocot3ro.annotations.ElectricalComponent
import com.cocot3ro.annotations.ElectricalTool
import com.cocot3ro.annotations.IndustrialComponent
import com.cocot3ro.annotations.IndustrialTool
import com.cocot3ro.annotations.Researcheable
import com.cocot3ro.annotations.RustObjectItem
import com.cocot3ro.annotations.StorageAdaptorAttachable
import com.cocot3ro.annotations.StorageMonitorAttachable
import com.cocot3ro.annotations.WaterComponent
import com.cocot3ro.annotations.WaterTool
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.Dependencies
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSVisitorVoid
import com.google.devtools.ksp.validate
import java.io.OutputStream

class RustObjectTypeProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger
) : SymbolProcessor {
    private val ln = System.lineSeparator()

    operator fun OutputStream.plusAssign(str: String) {
        this.write(str.toByteArray())
    }

    override fun process(resolver: Resolver): List<KSAnnotated> {

        val symbols = resolver
            .getSymbolsWithAnnotation(RustObjectItem::class.qualifiedName!!)
            .filterIsInstance<KSClassDeclaration>()

        if (!symbols.iterator().hasNext()) return emptyList()

        val rustObjExt: OutputStream = codeGenerator.createNewFile(
            dependencies = Dependencies(false),
            packageName = "com.cocot3ro.rustelectricity.generated.domain.model",
            fileName = "RustObjectItem"
        )

        rustObjExt += "package com.cocot3ro.rustelectricity.generated.domain.model$ln"
        rustObjExt += ln
        rustObjExt += "import com.cocot3ro.rustelectricity.domain.model.RustObjectType$ln"
        rustObjExt += "import com.cocot3ro.rustelectricity.domain.model.RustObjectItem$ln"
        rustObjExt += ln
        rustObjExt += "val RustObjectItem.Companion.deployables: Array<RustObjectType> by lazy {$ln"
        rustObjExt += "\tarrayOf($ln"

        val rustObjExtVisitor = RustObjectExtVisitor(rustObjExt)

        for (symbol in symbols) {

            val rustObjImpl: OutputStream = codeGenerator.createNewFile(
                dependencies = Dependencies(false),
                packageName = "com.cocot3ro.rustelectricity.generated.domain.model",
                fileName = symbol.simpleName.asString().lowercase().split("_")
                    .joinToString("") { it.replaceFirstChar { ch -> if (ch.isLetter()) ch.uppercaseChar() else ch } }
            )

            rustObjImpl += "package com.cocot3ro.rustelectricity.generated.domain.model$ln"
            rustObjImpl += ln

            symbol.accept(RustObjectImplVisitor(rustObjImpl), Unit)
            symbol.accept(rustObjExtVisitor, Unit)

            rustObjImpl.close()
        }

        rustObjExt += "\t)$ln"
        rustObjExt += "}$ln"

        rustObjExt.close()

        return symbols.filterNot { it.validate() }.toList()
    }

    inner class RustObjectExtVisitor(private val file: OutputStream) : KSVisitorVoid() {

        override fun visitClassDeclaration(classDeclaration: KSClassDeclaration, data: Unit) {
            val isValid = classDeclaration.annotations.any {
                it.shortName.asString() == Deployable::class.simpleName
            }

            if (!isValid) return

            file += "\t\tRustObjectType.${classDeclaration.simpleName.asString()},$ln"
        }
    }

    inner class RustObjectImplVisitor(private val file: OutputStream) : KSVisitorVoid() {

        override fun visitClassDeclaration(classDeclaration: KSClassDeclaration, data: Unit) {

            val isDeployable =
                classDeclaration.annotations.any { it.shortName.asString() == Deployable::class.simpleName }
            val isDoorControllerAttachable =
                classDeclaration.annotations.any { it.shortName.asString() == DoorControllerAttachable::class.simpleName }
            val isElectricalComponent =
                classDeclaration.annotations.any { it.shortName.asString() == ElectricalComponent::class.simpleName }
            val isElectricalTool: Boolean =
                classDeclaration.annotations.any { it.shortName.asString() == ElectricalTool::class.simpleName }
            val isIndustrialComponent =
                classDeclaration.annotations.any { it.shortName.asString() == IndustrialComponent::class.simpleName }
            val isIndustrialTool =
                classDeclaration.annotations.any { it.shortName.asString() == IndustrialTool::class.simpleName }
            val isResearcheable =
                classDeclaration.annotations.any { it.shortName.asString() == Researcheable::class.simpleName }
            val isStorageAdaptorAttachable =
                classDeclaration.annotations.any { it.shortName.asString() == StorageAdaptorAttachable::class.simpleName }
            val isStorageMonitorAttachable =
                classDeclaration.annotations.any { it.shortName.asString() == StorageMonitorAttachable::class.simpleName }
            val isWaterComponent =
                classDeclaration.annotations.any { it.shortName.asString() == WaterComponent::class.simpleName }
            val isWaterTool =
                classDeclaration.annotations.any { it.shortName.asString() == WaterTool::class.simpleName }

            file += "import com.cocot3ro.rustelectricity.domain.model.RustObjectItem$ln"
            file += "import com.cocot3ro.rustelectricity.domain.model.RustObjectType$ln"
            if (isDeployable || isWaterTool || isElectricalTool || isIndustrialTool) file += "import androidx.compose.ui.geometry.Offset$ln"
            if (isDeployable) file += "import com.cocot3ro.rustelectricity.domain.model.IDeployable$ln"
            if (isElectricalComponent || isIndustrialComponent || isWaterComponent) file += "import com.cocot3ro.rustelectricity.R$ln"
            if (isDoorControllerAttachable) file += "import com.cocot3ro.rustelectricity.domain.model.IDoorControllerAttachable$ln"
            if (isElectricalComponent) file += "import com.cocot3ro.rustelectricity.domain.model.ElectricalPlug$ln"
            if (isElectricalTool) file += "import com.cocot3ro.rustelectricity.domain.model.IElectricalTool$ln"
            if (isElectricalTool || isElectricalComponent) file += "import com.cocot3ro.rustelectricity.domain.model.IElectricalComponent$ln"
            if (isIndustrialComponent) file += "import com.cocot3ro.rustelectricity.domain.model.IndustrialPlug$ln"
            if (isIndustrialTool) file += "import com.cocot3ro.rustelectricity.domain.model.IIndustrialTool$ln"
            if (isIndustrialTool || isIndustrialComponent) file += "import com.cocot3ro.rustelectricity.domain.model.IIndustrialComponent$ln"
            if (isResearcheable) file += "import com.cocot3ro.rustelectricity.domain.model.IResearcheable$ln"
            if (isStorageAdaptorAttachable) file += "import com.cocot3ro.rustelectricity.domain.model.IStorageAdaptorAttachable$ln"
            if (isStorageMonitorAttachable) file += "import com.cocot3ro.rustelectricity.domain.model.IStorageMonitorAttachable$ln"
            if (isWaterComponent) file += "import com.cocot3ro.rustelectricity.domain.model.WaterPlug$ln"
            if (isWaterTool) file += "import com.cocot3ro.rustelectricity.domain.model.IWaterTool$ln"
            if (isWaterTool || isWaterComponent) file += "import com.cocot3ro.rustelectricity.domain.model.IWaterComponent$ln"

            file += ln

            val clazz = classDeclaration.simpleName.asString().lowercase().split("_")
                .joinToString("") { it.replaceFirstChar { ch -> if (ch.isLetter()) ch.uppercaseChar() else ch } }

            file += "class $clazz : RustObjectItem($ln"
            file += "\ttype = RustObjectType.${classDeclaration.simpleName.asString()}$ln"
            file += ")"

            if (isDeployable) file += ", IDeployable"
            if (isDoorControllerAttachable) file += ", IDoorControllerAttachable"
            if (isElectricalComponent) file += ", IElectricalComponent"
            if (isElectricalTool) file += ", IElectricalTool"
            if (isIndustrialComponent) file += ", IIndustrialComponent"
            if (isIndustrialTool) file += ", IIndustrialTool"
            if (isResearcheable) file += ", IResearcheable"
            if (isStorageAdaptorAttachable) file += ", IStorageAdaptorAttachable"
            if (isStorageMonitorAttachable) file += ", IStorageMonitorAttachable"
            if (isWaterComponent) file += ", IWaterComponent"
            if (isWaterTool) file += ", IWaterTool"

            file += " {$ln"

            if (isDeployable) file += "\toverride var position: Offset = Offset.Zero$ln"
            if (isDoorControllerAttachable) file += "\toverride var doorController: ItemDoorController? = null$ln"
            if (isElectricalComponent) {
                file += "\toverride var electricalInputs: Map<Int, ElectricalPlug> = "

                val inputs =
                    (classDeclaration.annotations.first { it.shortName.asString() == ElectricalComponent::class.simpleName }
                        .arguments.first { it.name?.asString() == "inputs" }.value as List<*>).map { it as String }

                if (inputs.any()) {
                    file += "mapOf($ln"
                    inputs.forEachIndexed { index, input ->
                        file += "\t\tR.string.$input to ElectricalPlug()"
                        if (index < inputs.size - 1) file += ","
                        file += ln
                    }
                    file += "\t)$ln"
                } else {
                    file += "emptyMap()$ln"
                }

                val outputs =
                    (classDeclaration.annotations.first { it.shortName.asString() == ElectricalComponent::class.simpleName }
                        .arguments.first { it.name?.asString() == "outputs" }.value as List<*>).map { it as String }

                file += "\toverride var electricalOutputs: Map<Int, ElectricalPlug> = "

                if (outputs.any()) {
                    file += "mapOf($ln"
                    outputs.forEachIndexed { index, output ->
                        file += "\t\tR.string.$output to ElectricalPlug()"
                        if (index < outputs.size - 1) file += ","
                        file += ln
                    }
                    file += "\t)$ln"
                } else {
                    file += "emptyMap()$ln"
                }
            }
            if (isIndustrialComponent) {
                file += "\toverride var industrialInputs: Map<Int, IndustrialPlug> = "

                val inputs =
                    (classDeclaration.annotations.first { it.shortName.asString() == IndustrialComponent::class.simpleName }
                        .arguments.first { it.name?.asString() == "inputs" }.value as List<*>).map { it as String }

                if (inputs.any()) {
                    file += "mapOf($ln"
                    inputs.forEachIndexed { index, input ->
                        file += "\t\tR.string.$input to IndustrialPlug()"
                        if (index < inputs.size - 1) file += ", $ln"
                    }
                    file += "\t)$ln"
                } else {
                    file += "emptyMap()$ln"
                }

                val outputs =
                    (classDeclaration.annotations.first { it.shortName.asString() == IndustrialComponent::class.simpleName }
                        .arguments.first { it.name?.asString() == "outputs" }.value as List<*>).map { it as String }

                file += "\toverride var industrialOutputs: Map<Int, IndustrialPlug> = "

                if (outputs.any()) {
                    file += "mapOf($ln"
                    outputs.forEachIndexed { index, output ->
                        file += "\t\tR.string.$output to IndustrialPlug()"
                        if (index < outputs.size - 1) file += ","
                        file += ln
                    }
                    file += "\t)$ln"
                } else {
                    file += "emptyMap()$ln"
                }
            }
            if (isStorageAdaptorAttachable) {
                val amount: Int =
                    classDeclaration.annotations.first { it.shortName.asString() == StorageAdaptorAttachable::class.simpleName }
                        .arguments.first { it.name?.asString() == "slotAmount" }.value as Int
                file += "\toverride val adaptors: Array<ItemStorageAdaptor?> = arrayOfNulls($amount)$ln"
            }
            if (isStorageMonitorAttachable) file += "\toverride var storageMonitor: ItemStorageMonitor? = null$ln"
            if (isWaterComponent) {
                file += "\toverride var waterInputs: Map<Int, WaterPlug> = "

                val inputs =
                    (classDeclaration.annotations.first { it.shortName.asString() == WaterComponent::class.simpleName }
                        .arguments.first { it.name?.asString() == "inputs" }.value as List<*>).map { it as String }

                if (inputs.any()) {
                    file += "mapOf($ln"
                    inputs.forEachIndexed { index, input ->
                        file += "\t\tR.string.$input to WaterPlug()"
                        if (index < inputs.size - 1) file += ","
                        file += ln
                    }
                    file += "\t)$ln"
                } else {
                    file += "emptyMap()$ln"
                }

                val outputs =
                    (classDeclaration.annotations.first { it.shortName.asString() == WaterComponent::class.simpleName }
                        .arguments.first { it.name?.asString() == "outputs" }.value as List<*>).map { it as String }

                file += "\toverride var waterOutputs: Map<Int, WaterPlug> = "

                if (outputs.any()) {
                    file += "mapOf($ln"
                    outputs.forEachIndexed { index, output ->
                        file += "\t\tR.string.$output to WaterPlug()"
                        if (index < outputs.size - 1) file += ","
                        file += ln
                    }
                    file += "\t)$ln"
                } else {
                    file += "emptyMap()$ln"
                }
            }

            if (isElectricalTool || isIndustrialTool || isWaterTool) {
                file += "\toverride var plugA: ${if (isElectricalTool) "IElectricalComponent" else if (isIndustrialTool) "IIndustrialComponent" else "IWaterComponent"}? = null$ln"
                file += "\toverride var plugB: ${if (isElectricalTool) "IElectricalComponent" else if (isIndustrialTool) "IIndustrialComponent" else "IWaterComponent"}? = null$ln"
                file += "\toverride var positions: MutableList<Offset> = mutableListOf()$ln"
            }

            file += "}"
        }
    }
}
