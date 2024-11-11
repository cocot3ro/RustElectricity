package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemMushroom : RustObjectItem(
    type = RustObjectType.ITEM_MUSHROOM,
    name = R.string.item_mushroom,
    image = R.drawable.item_mushroom
) {

}
