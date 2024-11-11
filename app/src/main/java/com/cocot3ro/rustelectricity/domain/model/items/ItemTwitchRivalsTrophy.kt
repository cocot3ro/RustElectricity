package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemTwitchRivalsTrophy : RustObjectItem(
    type = RustObjectType.ITEM_TWITCH_RIVALS_TROPHY,
    name = R.string.item_twitch_rivals_trophy,
    image = R.drawable.item_twitch_rivals_trophy
) {

}
