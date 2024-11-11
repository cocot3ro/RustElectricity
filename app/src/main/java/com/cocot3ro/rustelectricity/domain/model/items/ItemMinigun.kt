package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemMinigun : RustObjectItem(
    type = RustObjectType.ITEM_MINIGUN,
    name = R.string.item_minigun,
    image = R.drawable.item_minigun
) {

}
