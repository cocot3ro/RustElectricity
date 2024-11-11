package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSkullFirePit : RustObjectItem(
    type = RustObjectType.ITEM_SKULL_FIRE_PIT,
    name = R.string.item_skull_fire_pit,
    image = R.drawable.item_skull_fire_pit
) {

}
