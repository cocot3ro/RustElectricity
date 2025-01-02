package com.cocot3ro.rustelectricity.interfaces

import androidx.annotation.StringRes

interface IPlug<T : ITool<*>> {
    @get:StringRes
    val nameRes: Int
    var pluggedTo: T?
}

interface IWaterPlug : IPlug<IWaterTool>
interface IElectricalPlug : IPlug<IElectricalTool>
interface IIndustrialPlug : IPlug<IIndustrialTool>