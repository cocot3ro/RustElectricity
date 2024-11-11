package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemHerring : RustObjectItem(
    type = RustObjectType.ITEM_HERRING,
    name = R.string.item_herring,
    image = R.drawable.item_herring
) {

}
