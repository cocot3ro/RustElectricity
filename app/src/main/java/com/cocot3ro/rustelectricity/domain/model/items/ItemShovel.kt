package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemShovel : RustObjectItem(
    type = RustObjectType.ITEM_SHOVEL,
    name = R.string.item_shovel,
    image = R.drawable.item_shovel
) {

}
