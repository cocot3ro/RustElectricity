package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemDragonDoorKnocker : RustObjectItem(
    type = RustObjectType.ITEM_DRAGON_DOOR_KNOCKER,
    name = R.string.item_dragon_door_knocker,
    image = R.drawable.item_dragon_door_knocker
) {

}
