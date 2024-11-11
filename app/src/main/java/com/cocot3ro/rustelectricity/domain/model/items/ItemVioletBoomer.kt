package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemVioletBoomer : RustObjectItem(
    type = RustObjectType.ITEM_VIOLET_BOOMER,
    name = R.string.item_violet_boomer,
    image = R.drawable.item_violet_boomer
) {

}
