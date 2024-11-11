package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWetsuit : RustObjectItem(
    type = RustObjectType.ITEM_WETSUIT,
    name = R.string.item_wetsuit,
    image = R.drawable.item_wetsuit
) {

}
