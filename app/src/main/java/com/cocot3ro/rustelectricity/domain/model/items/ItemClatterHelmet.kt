package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemClatterHelmet : RustObjectItem(
    type = RustObjectType.ITEM_CLATTER_HELMET,
    name = R.string.item_clatter_helmet,
    image = R.drawable.item_clatter_helmet
) {

}
