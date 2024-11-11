package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWoodenFrontierBarDoors : RustObjectItem(
    type = RustObjectType.ITEM_WOODEN_FRONTIER_BAR_DOORS,
    name = R.string.item_wooden_frontier_bar_doors,
    image = R.drawable.item_wooden_frontier_bar_doors
) {

}
