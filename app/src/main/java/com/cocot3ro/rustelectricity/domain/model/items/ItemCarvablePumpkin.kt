package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCarvablePumpkin : RustObjectItem(
    type = RustObjectType.ITEM_CARVABLE_PUMPKIN,
    name = R.string.item_carvable_pumpkin,
    image = R.drawable.item_carvable_pumpkin
) {

}
