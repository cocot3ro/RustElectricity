package com.cocot3ro.rustelectricity.interfaces

sealed interface IComponent

interface IElectricalComponent : IComponent {
    val electricalInputs: Map<Int, IElectricalPlug>
    val electricalOutputs: Map<Int, IElectricalPlug>
}

interface IIndustrialComponent : IComponent {
    val industrialInputs: Map<Int, IIndustrialPlug>
    val industrialOutputs: Map<Int, IIndustrialPlug>
}

interface IWaterComponent : IComponent {
    val waterInputs: Map<Int, IWaterPlug>
    val waterOutputs: Map<Int, IWaterPlug>
}
