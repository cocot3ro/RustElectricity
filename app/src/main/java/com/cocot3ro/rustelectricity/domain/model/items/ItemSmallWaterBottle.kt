package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSmallWaterBottle : RustObjectItem(
    type = RustObjectType.ITEM_SMALL_WATER_BOTTLE,
    name = R.string.item_small_water_bottle,
    image = R.drawable.item_small_water_bottle
) {

}
