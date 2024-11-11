package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGreenBoomer : RustObjectItem(
    type = RustObjectType.ITEM_GREEN_BOOMER,
    name = R.string.item_green_boomer,
    image = R.drawable.item_green_boomer
) {

}
