package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWolfSkull : RustObjectItem(
    type = RustObjectType.ITEM_WOLF_SKULL,
    name = R.string.item_wolf_skull,
    image = R.drawable.item_wolf_skull
) {

}
