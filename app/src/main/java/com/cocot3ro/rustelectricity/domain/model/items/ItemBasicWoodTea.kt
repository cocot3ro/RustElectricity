package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBasicWoodTea : RustObjectItem(
    type = RustObjectType.ITEM_BASIC_WOOD_TEA,
    name = R.string.item_basic_wood_tea,
    image = R.drawable.item_basic_wood_tea
) {

}
