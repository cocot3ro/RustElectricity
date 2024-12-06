package com.cocot3ro.rustelectricity.domain.model

sealed interface IComponent

interface IElectricalComponent : IComponent {
    val electricalInputs: Map<Int, ElectricalPlug>
    val electricalOutputs: Map<Int, ElectricalPlug>
}

interface IIndustrialComponent : IComponent {
    val industrialInputs: Map<Int, IndustrialPlug>
    val industrialOutputs: Map<Int, IndustrialPlug>
}

interface IWaterComponent : IComponent {
    val waterInputs: Map<Int, WaterPlug>
    val waterOutputs: Map<Int, WaterPlug>
}
