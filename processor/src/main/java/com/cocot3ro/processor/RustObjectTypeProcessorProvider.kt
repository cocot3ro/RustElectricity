package com.cocot3ro.processor

import com.google.devtools.ksp.processing.SymbolProcessor
import com.google.devtools.ksp.processing.SymbolProcessorEnvironment
import com.google.devtools.ksp.processing.SymbolProcessorProvider

class RustObjectTypeProcessorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return RustObjectTypeProcessor(
            codeGenerator = environment.codeGenerator,
            logger = environment.logger
        )
    }
}