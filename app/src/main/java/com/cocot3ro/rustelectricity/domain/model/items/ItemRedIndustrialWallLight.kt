package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRedIndustrialWallLight : RustObjectItem(
    type = RustObjectType.ITEM_RED_INDUSTRIAL_WALL_LIGHT,
    name = R.string.item_red_industrial_wall_light,
    image = R.drawable.item_red_industrial_wall_light
) {

}
