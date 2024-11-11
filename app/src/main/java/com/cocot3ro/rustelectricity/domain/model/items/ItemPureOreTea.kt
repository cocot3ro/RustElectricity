package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPureOreTea : RustObjectItem(
    type = RustObjectType.ITEM_PURE_ORE_TEA,
    name = R.string.item_pure_ore_tea,
    image = R.drawable.item_pure_ore_tea
) {

}
