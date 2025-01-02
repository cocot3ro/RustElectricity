package com.cocot3ro.rustelectricity.annotations

import kotlin.reflect.KClass

annotation class RustObject(
    val resourcesClass: KClass<*>,
    val implementations: Array<KClass<*>>
)