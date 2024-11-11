package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSpoiledChicken : RustObjectItem(
    type = RustObjectType.ITEM_SPOILED_CHICKEN,
    name = R.string.item_spoiled_chicken,
    image = R.drawable.item_spoiled_chicken
) {

}
