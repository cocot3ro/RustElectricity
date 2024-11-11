package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemVodkaBottle : RustObjectItem(
    type = RustObjectType.ITEM_VODKA_BOTTLE,
    name = R.string.item_vodka_bottle,
    image = R.drawable.item_vodka_bottle
) {

}
