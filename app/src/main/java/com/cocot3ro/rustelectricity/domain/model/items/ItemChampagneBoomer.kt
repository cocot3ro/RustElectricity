package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemChampagneBoomer : RustObjectItem(
    type = RustObjectType.ITEM_CHAMPAGNE_BOOMER,
    name = R.string.item_champagne_boomer,
    image = R.drawable.item_champagne_boomer
) {

}
