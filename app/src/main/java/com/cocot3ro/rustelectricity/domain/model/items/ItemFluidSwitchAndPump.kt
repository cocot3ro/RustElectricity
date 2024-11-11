package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemFluidSwitchAndPump(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_FLUID_SWITCH_AND_PUMP,
    name = R.string.item_fluid_switch_and_pump,
    image = R.drawable.item_fluid_switch_and_pump
), Researcheable {

}
