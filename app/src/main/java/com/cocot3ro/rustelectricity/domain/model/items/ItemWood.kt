package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWood : RustObjectItem(
    type = RustObjectType.ITEM_WOOD,
    name = R.string.item_wood,
    image = R.drawable.item_wood
) {

}
