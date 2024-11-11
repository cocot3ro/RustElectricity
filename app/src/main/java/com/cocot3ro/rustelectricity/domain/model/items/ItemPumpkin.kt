package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPumpkin : RustObjectItem(
    type = RustObjectType.ITEM_PUMPKIN,
    name = R.string.item_pumpkin,
    image = R.drawable.item_pumpkin
) {

}
