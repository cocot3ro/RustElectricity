package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPatternBoomer : RustObjectItem(
    type = RustObjectType.ITEM_PATTERN_BOOMER,
    name = R.string.item_pattern_boomer,
    image = R.drawable.item_pattern_boomer
) {

}
