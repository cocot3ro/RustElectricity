package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemM4Shotgun : RustObjectItem(
    type = RustObjectType.ITEM_M4_SHOTGUN,
    name = R.string.item_m4_shotgun,
    image = R.drawable.item_m4_shotgun
) {

}
