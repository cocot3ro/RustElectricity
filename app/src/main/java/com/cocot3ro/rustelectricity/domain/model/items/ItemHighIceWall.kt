package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemHighIceWall : RustObjectItem(
    type = RustObjectType.ITEM_HIGH_ICE_WALL,
    name = R.string.item_high_ice_wall,
    image = R.drawable.item_high_ice_wall
) {

}
