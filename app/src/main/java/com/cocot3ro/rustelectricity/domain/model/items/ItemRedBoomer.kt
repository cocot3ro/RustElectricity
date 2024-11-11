package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRedBoomer : RustObjectItem(
    type = RustObjectType.ITEM_RED_BOOMER,
    name = R.string.item_red_boomer,
    image = R.drawable.item_red_boomer
) {

}
