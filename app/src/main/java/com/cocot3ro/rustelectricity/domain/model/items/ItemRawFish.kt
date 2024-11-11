package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRawFish : RustObjectItem(
    type = RustObjectType.ITEM_RAW_FISH,
    name = R.string.item_raw_fish,
    image = R.drawable.item_raw_fish
) {

}
