package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemFishTrophy : RustObjectItem(
    type = RustObjectType.ITEM_FISH_TROPHY,
    name = R.string.item_fish_trophy,
    image = R.drawable.item_fish_trophy
) {

}
