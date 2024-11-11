package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemChippyArcadeGame : RustObjectItem(
    type = RustObjectType.ITEM_CHIPPY_ARCADE_GAME,
    name = R.string.item_chippy_arcade_game,
    image = R.drawable.item_chippy_arcade_game
) {

}