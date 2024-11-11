package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemDoorCloser : RustObjectItem(
    type = RustObjectType.ITEM_DOOR_CLOSER,
    name = R.string.item_door_closer,
    image = R.drawable.item_door_closer
) {

}
