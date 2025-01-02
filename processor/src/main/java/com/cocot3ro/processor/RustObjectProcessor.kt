package com.cocot3ro.processor

import com.cocot3ro.rustelectricity.annotations.RustObject
import com.google.devtools.ksp.processing.CodeGenerator
import com.google.devtools.ksp.processing.KSPLogger
import com.google.devtools.ksp.processing.Resolver
import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSFunctionDeclaration
import com.google.devtools.ksp.symbol.KSVisitorVoid
import com.google.devtools.ksp.validate
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.ksp.writeTo

class RustObjectProcessor(
    private val codeGenerator: CodeGenerator,
    private val logger: KSPLogger
) : SymbolProcessor {

    override fun process(resolver: Resolver): List<KSAnnotated> {

        val symbols = resolver
            .getSymbolsWithAnnotation(RustObject::class.qualifiedName!!)
            .filterIsInstance<KSClassDeclaration>()

        if (!symbols.iterator().hasNext()) return emptyList()

        symbols.forEach { symbol ->
            val builder = FileSpec.builder(
                packageName = symbol.packageName.asString(),
                fileName = "${symbol.simpleName.asString()}Impl.kt"
            )
            symbol.accept(RustObjectImplVisitor(builder), Unit)
            builder.build().writeTo(codeGenerator, false)
        }

        return symbols.filterNot { it.validate() }.toList()
    }

    inner class RustObjectExtVisitor : KSVisitorVoid() {

        override fun visitClassDeclaration(classDeclaration: KSClassDeclaration, data: Unit) {

        }

        override fun visitFunctionDeclaration(function: KSFunctionDeclaration, data: Unit) {

        }

    }

    inner class RustObjectImplVisitor(val fileSpec: FileSpec.Builder) : KSVisitorVoid() {

        override fun visitClassDeclaration(classDeclaration: KSClassDeclaration, data: Unit) {
            fileSpec.addType(
                TypeSpec.classBuilder("${classDeclaration.simpleName.asString()}Impl")
                    .apply {
                        for (a in classDeclaration.annotations) {
                            logger.warn("Annotation: ${a.shortName}, $a")
                        }
                    }
                    .build()
            )
        }

        override fun visitFunctionDeclaration(function: KSFunctionDeclaration, data: Unit) {

        }

    }
}
