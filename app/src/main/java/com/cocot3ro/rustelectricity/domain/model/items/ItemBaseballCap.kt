package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBaseballCap : RustObjectItem(
    type = RustObjectType.ITEM_BASEBALL_CAP,
    name = R.string.item_baseball_cap,
    image = R.drawable.item_baseball_cap
) {

}
