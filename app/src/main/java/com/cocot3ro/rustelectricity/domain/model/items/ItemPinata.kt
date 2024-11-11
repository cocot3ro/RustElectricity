package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPinata : RustObjectItem(
    type = RustObjectType.ITEM_PINATA,
    name = R.string.item_pinata,
    image = R.drawable.item_pinata
) {

}