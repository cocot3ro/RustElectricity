package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemEmptyTunaCan : RustObjectItem(
    type = RustObjectType.ITEM_EMPTY_TUNA_CAN,
    name = R.string.item_empty_tuna_can,
    image = R.drawable.item_empty_tuna_can
) {

}
