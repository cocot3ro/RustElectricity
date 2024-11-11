package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemHighQualityMetal : RustObjectItem(
    type = RustObjectType.ITEM_HIGH_QUALITY_METAL,
    name = R.string.item_high_quality_metal,
    image = R.drawable.item_high_quality_metal
) {

}
