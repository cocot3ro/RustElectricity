package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemMinnows : RustObjectItem(
    type = RustObjectType.ITEM_MINNOWS,
    name = R.string.item_minnows,
    image = R.drawable.item_minnows
) {

}
