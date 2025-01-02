package com.cocot3ro.rustelectricity.annotations

import kotlin.reflect.KClass

annotation class ElectricalComponent(
    val inputs: Array<KClass<*>>,
    val outputs: Array<KClass<*>>
)