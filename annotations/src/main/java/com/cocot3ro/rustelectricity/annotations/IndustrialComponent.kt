package com.cocot3ro.rustelectricity.annotations

import kotlin.reflect.KClass

annotation class IndustrialComponent(
    val industrialInputs: Array<KClass<*>>,
    val industrialOutputs: Array<KClass<*>>
)