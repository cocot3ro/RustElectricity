package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemLargeBackpack : RustObjectItem(
    type = RustObjectType.ITEM_LARGE_BACKPACK,
    name = R.string.item_large_backpack,
    image = R.drawable.item_large_backpack
) {

}
