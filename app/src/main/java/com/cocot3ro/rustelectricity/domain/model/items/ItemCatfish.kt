package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCatfish : RustObjectItem(
    type = RustObjectType.ITEM_CATFISH,
    name = R.string.item_catfish,
    image = R.drawable.item_catfish
) {

}
