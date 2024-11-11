package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemDivingFins : RustObjectItem(
    type = RustObjectType.ITEM_DIVING_FINS,
    name = R.string.item_diving_fins,
    image = R.drawable.item_diving_fins
) {

}