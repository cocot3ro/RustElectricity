package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSpoiledWolfMeat : RustObjectItem(
    type = RustObjectType.ITEM_SPOILED_WOLF_MEAT,
    name = R.string.item_spoiled_wolf_meat,
    image = R.drawable.item_spoiled_wolf_meat
) {

}
