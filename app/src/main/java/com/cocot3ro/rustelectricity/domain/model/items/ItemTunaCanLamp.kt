package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemTunaCanLamp : RustObjectItem(
    type = RustObjectType.ITEM_TUNA_CAN_LAMP,
    name = R.string.item_tuna_can_lamp,
    image = R.drawable.item_tuna_can_lamp
) {

}
