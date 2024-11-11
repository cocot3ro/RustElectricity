package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemHalloweenCandy : RustObjectItem(
    type = RustObjectType.ITEM_HALLOWEEN_CANDY,
    name = R.string.item_halloween_candy,
    image = R.drawable.item_halloween_candy
) {

}
