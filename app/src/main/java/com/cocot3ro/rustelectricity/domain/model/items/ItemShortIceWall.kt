package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemShortIceWall : RustObjectItem(
    type = RustObjectType.ITEM_SHORT_ICE_WALL,
    name = R.string.item_short_ice_wall,
    image = R.drawable.item_short_ice_wall
) {

}
