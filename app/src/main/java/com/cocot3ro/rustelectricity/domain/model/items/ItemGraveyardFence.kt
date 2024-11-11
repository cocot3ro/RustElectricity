package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGraveyardFence : RustObjectItem(
    type = RustObjectType.ITEM_GRAVEYARD_FENCE,
    name = R.string.item_graveyard_fence,
    image = R.drawable.item_graveyard_fence
) {

}
