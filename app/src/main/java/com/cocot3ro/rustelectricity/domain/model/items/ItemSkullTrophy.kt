package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSkullTrophy : RustObjectItem(
    type = RustObjectType.ITEM_SKULL_TROPHY,
    name = R.string.item_skull_trophy,
    image = R.drawable.item_skull_trophy
) {

}
