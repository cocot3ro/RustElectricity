package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemScientistSuit : RustObjectItem(
    type = RustObjectType.ITEM_SCIENTIST_SUIT,
    name = R.string.item_scientist_suit,
    image = R.drawable.item_scientist_suit
) {

}
