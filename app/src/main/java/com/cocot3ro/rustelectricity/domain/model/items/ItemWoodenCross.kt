package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWoodenCross : RustObjectItem(
    type = RustObjectType.ITEM_WOODEN_CROSS,
    name = R.string.item_wooden_cross,
    image = R.drawable.item_wooden_cross
) {

}
