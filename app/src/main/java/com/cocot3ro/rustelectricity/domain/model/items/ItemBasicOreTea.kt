package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBasicOreTea : RustObjectItem(
    type = RustObjectType.ITEM_BASIC_ORE_TEA,
    name = R.string.item_basic_ore_tea,
    image = R.drawable.item_basic_ore_tea
) {

}
