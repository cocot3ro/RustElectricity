package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSkullDoorKnocker : RustObjectItem(
    type = RustObjectType.ITEM_SKULL_DOOR_KNOCKER,
    name = R.string.item_skull_door_knocker,
    image = R.drawable.item_skull_door_knocker
) {

}
