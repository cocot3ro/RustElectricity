package com.cocot3ro.rustelectricity.annotations

import kotlin.reflect.KClass

annotation class WaterComponent(
    val waterInputs: Array<KClass<*>>,
    val waterOutputs: Array<KClass<*>>
)