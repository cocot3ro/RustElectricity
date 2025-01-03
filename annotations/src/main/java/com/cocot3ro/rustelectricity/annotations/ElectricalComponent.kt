package com.cocot3ro.rustelectricity.annotations

import kotlin.reflect.KClass

annotation class ElectricalComponent(
    val electricalInputs: Array<KClass<*>>,
    val electricalOutputs: Array<KClass<*>>
)