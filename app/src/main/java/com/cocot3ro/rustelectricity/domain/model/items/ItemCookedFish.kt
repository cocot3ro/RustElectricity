package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCookedFish : RustObjectItem(
    type = RustObjectType.ITEM_COOKED_FISH,
    name = R.string.item_cooked_fish,
    image = R.drawable.item_cooked_fish
) {

}
