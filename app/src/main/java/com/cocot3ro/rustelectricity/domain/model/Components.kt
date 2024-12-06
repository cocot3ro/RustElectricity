package com.cocot3ro.rustelectricity.domain.model

sealed interface Component

interface ElectricalComponent : Component {
    val electricalInputs: Map<Int, ElectricalPlug>
    val electricalOutputs: Map<Int, ElectricalPlug>
}

interface IndustrialComponent : Component {
    val industrialInputs: Map<Int, IndustrialPlug>
    val industrialOutputs: Map<Int, IndustrialPlug>
}

interface WaterComponent : Component {
    val waterInputs: Map<Int, WaterPlug>
    val waterOutputs: Map<Int, WaterPlug>
}
