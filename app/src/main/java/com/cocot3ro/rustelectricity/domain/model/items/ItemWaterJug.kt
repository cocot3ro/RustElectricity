package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWaterJug : RustObjectItem(
    type = RustObjectType.ITEM_WATER_JUG,
    name = R.string.item_water_jug,
    image = R.drawable.item_water_jug
) {

}
