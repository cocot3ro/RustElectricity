package com.cocot3ro.rustelectricity.annotations

import kotlin.reflect.KClass

annotation class IndustrialComponent(
    val inputs: Array<KClass<*>>,
    val outputs: Array<KClass<*>>
)