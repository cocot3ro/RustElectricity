package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWorm : RustObjectItem(
    type = RustObjectType.ITEM_WORM,
    name = R.string.item_worm,
    image = R.drawable.item_worm
) {

}
