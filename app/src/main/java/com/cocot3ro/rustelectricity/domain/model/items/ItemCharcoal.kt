package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCharcoal : RustObjectItem(
    type = RustObjectType.ITEM_CHARCOAL,
    name = R.string.item_charcoal,
    image = R.drawable.item_charcoal
) {

}
