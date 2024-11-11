package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemOrangeBoomer : RustObjectItem(
    type = RustObjectType.ITEM_ORANGE_BOOMER,
    name = R.string.item_orange_boomer,
    image = R.drawable.item_orange_boomer
) {

}
