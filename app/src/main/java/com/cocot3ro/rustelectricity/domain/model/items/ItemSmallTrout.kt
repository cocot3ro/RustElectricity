package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSmallTrout : RustObjectItem(
    type = RustObjectType.ITEM_SMALL_TROUT,
    name = R.string.item_small_trout,
    image = R.drawable.item_small_trout
) {

}
