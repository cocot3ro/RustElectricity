package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRadRemovalTea : RustObjectItem(
    type = RustObjectType.ITEM_RAD_REMOVAL_TEA,
    name = R.string.item_rad_removal_tea,
    image = R.drawable.item_rad_removal_tea
) {

}
