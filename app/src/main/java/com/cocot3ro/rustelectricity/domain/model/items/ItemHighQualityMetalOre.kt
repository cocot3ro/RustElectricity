package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemHighQualityMetalOre : RustObjectItem(
    type = RustObjectType.ITEM_HIGH_QUALITY_METAL_ORE,
    name = R.string.item_high_quality_metal_ore,
    image = R.drawable.item_high_quality_metal_ore
) {

}
