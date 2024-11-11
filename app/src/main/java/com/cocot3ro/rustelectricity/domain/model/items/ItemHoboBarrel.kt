package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemHoboBarrel : RustObjectItem(
    type = RustObjectType.ITEM_HOBO_BARREL,
    name = R.string.item_hobo_barrel,
    image = R.drawable.item_hobo_barrel
) {

}
