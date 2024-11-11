package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemLargeHuntingTrophy : RustObjectItem(
    type = RustObjectType.ITEM_LARGE_HUNTING_TROPHY,
    name = R.string.item_large_hunting_trophy,
    image = R.drawable.item_large_hunting_trophy
) {

}
