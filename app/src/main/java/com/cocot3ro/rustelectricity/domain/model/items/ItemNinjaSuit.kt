package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemNinjaSuit : RustObjectItem(
    type = RustObjectType.ITEM_NINJA_SUIT,
    name = R.string.item_ninja_suit,
    image = R.drawable.item_ninja_suit
) {

}
