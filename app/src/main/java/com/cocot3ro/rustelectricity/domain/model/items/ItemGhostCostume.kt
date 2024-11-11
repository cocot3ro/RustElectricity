package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGhostCostume : RustObjectItem(
    type = RustObjectType.ITEM_GHOST_COSTUME,
    name = R.string.item_ghost_costume,
    image = R.drawable.item_ghost_costume
) {

}
