package com.cocot3ro.rustelectricity.annotations

import kotlin.reflect.KClass

annotation class WaterComponent(
    val inputs: Array<KClass<*>>,
    val outputs: Array<KClass<*>>
)