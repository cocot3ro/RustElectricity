package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWater : RustObjectItem(
    type = RustObjectType.ITEM_WATER,
    name = R.string.item_water,
    image = R.drawable.item_water
) {

}
