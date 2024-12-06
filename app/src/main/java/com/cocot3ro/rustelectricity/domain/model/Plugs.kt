package com.cocot3ro.rustelectricity.domain.model

import com.cocot3ro.rustelectricity.generated.domain.model.ItemHoseTool
import com.cocot3ro.rustelectricity.generated.domain.model.ItemPipeTool
import com.cocot3ro.rustelectricity.generated.domain.model.ItemWireTool

sealed interface Plug<T : Tool<*>> {
    var pluggedTo: T?
}

data class WaterPlug(
    override var pluggedTo: ItemHoseTool? = null
) : Plug<ItemHoseTool>

data class ElectricalPlug(
    override var pluggedTo: ItemWireTool? = null
) : Plug<ItemWireTool>

data class IndustrialPlug(
    override var pluggedTo: ItemPipeTool? = null
) : Plug<ItemPipeTool>
