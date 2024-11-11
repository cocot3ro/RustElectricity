package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSmallShark : RustObjectItem(
    type = RustObjectType.ITEM_SMALL_SHARK,
    name = R.string.item_small_shark,
    image = R.drawable.item_small_shark
) {

}