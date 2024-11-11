package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRailRoadPlanter : RustObjectItem(
    type = RustObjectType.ITEM_RAIL_ROAD_PLANTER,
    name = R.string.item_rail_road_planter,
    image = R.drawable.item_rail_road_planter
) {

}
