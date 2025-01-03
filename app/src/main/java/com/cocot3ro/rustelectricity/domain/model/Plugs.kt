package com.cocot3ro.rustelectricity.domain.model

import com.cocot3ro.rustelectricity.interfaces.IElectricalPlug
import com.cocot3ro.rustelectricity.interfaces.IElectricalTool
import com.cocot3ro.rustelectricity.interfaces.IIndustrialPlug
import com.cocot3ro.rustelectricity.interfaces.IIndustrialTool
import com.cocot3ro.rustelectricity.interfaces.IWaterPlug
import com.cocot3ro.rustelectricity.interfaces.IWaterTool

abstract class WaterPlug(
    override val nameRes: Int,
    override var pluggedTo: IWaterTool? = null
) : IWaterPlug

abstract class ElectricalPlug(
    override val nameRes: Int,
    override var pluggedTo: IElectricalTool? = null
) : IElectricalPlug

abstract class IndustrialPlug(
    override val nameRes: Int,
    override var pluggedTo: IIndustrialTool? = null
) : IIndustrialPlug