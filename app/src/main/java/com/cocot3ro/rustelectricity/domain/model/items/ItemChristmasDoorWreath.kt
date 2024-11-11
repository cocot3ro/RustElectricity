package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemChristmasDoorWreath : RustObjectItem(
    type = RustObjectType.ITEM_CHRISTMAS_DOOR_WREATH,
    name = R.string.item_christmas_door_wreath,
    image = R.drawable.item_christmas_door_wreath
) {

}
