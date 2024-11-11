package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPureAntiRadTea : RustObjectItem(
    type = RustObjectType.ITEM_PURE_ANTI_RAD_TEA,
    name = R.string.item_pure_anti_rad_tea,
    image = R.drawable.item_pure_anti_rad_tea
) {

}
