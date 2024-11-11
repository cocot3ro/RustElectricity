package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPureWoodTea : RustObjectItem(
    type = RustObjectType.ITEM_PURE_WOOD_TEA,
    name = R.string.item_pure_wood_tea,
    image = R.drawable.item_pure_wood_tea
) {

}
