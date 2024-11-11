package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBasicMaxHealthTea : RustObjectItem(
    type = RustObjectType.ITEM_BASIC_MAX_HEALTH_TEA,
    name = R.string.item_basic_max_health_tea,
    image = R.drawable.item_basic_max_health_tea
) {

}
