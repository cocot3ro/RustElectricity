package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSulfurOre : RustObjectItem(
    type = RustObjectType.ITEM_SULFUR_ORE,
    name = R.string.item_sulfur_ore,
    image = R.drawable.item_sulfur_ore
) {

}
