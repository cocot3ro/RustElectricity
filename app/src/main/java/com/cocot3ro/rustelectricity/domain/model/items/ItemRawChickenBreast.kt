package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRawChickenBreast : RustObjectItem(
    type = RustObjectType.ITEM_RAW_CHICKEN_BREAST,
    name = R.string.item_raw_chicken_breast,
    image = R.drawable.item_raw_chicken_breast
) {

}
