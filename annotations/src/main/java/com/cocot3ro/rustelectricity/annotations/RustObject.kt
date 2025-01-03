package com.cocot3ro.rustelectricity.annotations

import kotlin.reflect.KClass

annotation class RustObject(
    val implementations: Array<KClass<*>>
)