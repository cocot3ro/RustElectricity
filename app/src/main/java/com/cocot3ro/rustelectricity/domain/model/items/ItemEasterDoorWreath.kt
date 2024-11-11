package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemEasterDoorWreath : RustObjectItem(
    type = RustObjectType.ITEM_EASTER_DOOR_WREATH,
    name = R.string.item_easter_door_wreath,
    image = R.drawable.item_easter_door_wreath
) {

}