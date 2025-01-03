package com.cocot3ro.rustelectricity.interfaces

interface IPlug<T : ITool<*>> {
    val nameRes: Int
    var pluggedTo: T?
}

interface IWaterPlug : IPlug<IWaterTool>
interface IElectricalPlug : IPlug<IElectricalTool>
interface IIndustrialPlug : IPlug<IIndustrialTool>
