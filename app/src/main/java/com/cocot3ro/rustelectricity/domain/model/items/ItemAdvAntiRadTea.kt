package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemAdvAntiRadTea : RustObjectItem(
    type = RustObjectType.ITEM_ADV_ANTI_RAD_TEA,
    name = R.string.item_adv_anti_rad_tea,
    image = R.drawable.item_adv_anti_rad_tea
) {

}
