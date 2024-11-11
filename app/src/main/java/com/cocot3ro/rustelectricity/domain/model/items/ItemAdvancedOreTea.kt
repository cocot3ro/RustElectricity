package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemAdvancedOreTea : RustObjectItem(
    type = RustObjectType.ITEM_ADVANCED_ORE_TEA,
    name = R.string.item_advanced_ore_tea,
    image = R.drawable.item_advanced_ore_tea
) {

}