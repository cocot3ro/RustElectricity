package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemArcticScientistSuit : RustObjectItem(
    type = RustObjectType.ITEM_ARCTIC_SCIENTIST_SUIT,
    name = R.string.item_arctic_scientist_suit,
    image = R.drawable.item_arctic_scientist_suit
) {

}
