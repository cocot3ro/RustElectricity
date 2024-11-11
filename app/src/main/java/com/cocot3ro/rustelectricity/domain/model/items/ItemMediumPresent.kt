package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemMediumPresent : RustObjectItem(
    type = RustObjectType.ITEM_MEDIUM_PRESENT,
    name = R.string.item_medium_present,
    image = R.drawable.item_medium_present
) {

}
