package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGreenIndustrialWallLight : RustObjectItem(
    type = RustObjectType.ITEM_GREEN_INDUSTRIAL_WALL_LIGHT,
    name = R.string.item_green_industrial_wall_light,
    image = R.drawable.item_green_industrial_wall_light
) {

}
