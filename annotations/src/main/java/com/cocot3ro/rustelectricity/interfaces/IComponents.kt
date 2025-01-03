package com.cocot3ro.rustelectricity.interfaces

sealed interface IComponent

interface IElectricalComponent : IComponent {
    var electricalInputs: Array<IElectricalPlug>
    var electricalOutputs: Array<IElectricalPlug>
}

interface IIndustrialComponent : IComponent {
    var industrialInputs: Array<IIndustrialPlug>
    var industrialOutputs: Array<IIndustrialPlug>
}

interface IWaterComponent : IComponent {
    var waterInputs: Array<IWaterPlug>
    var waterOutputs: Array<IWaterPlug>
}
