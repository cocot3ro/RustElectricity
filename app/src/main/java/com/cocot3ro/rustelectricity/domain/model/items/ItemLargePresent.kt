package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemLargePresent : RustObjectItem(
    type = RustObjectType.ITEM_LARGE_PRESENT,
    name = R.string.item_large_present,
    image = R.drawable.item_large_present
) {

}
