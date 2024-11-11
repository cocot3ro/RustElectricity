package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemMetalOre : RustObjectItem(
    type = RustObjectType.ITEM_METAL_ORE,
    name = R.string.item_metal_ore,
    image = R.drawable.item_metal_ore
) {

}
