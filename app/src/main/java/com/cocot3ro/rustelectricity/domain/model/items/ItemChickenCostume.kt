package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemChickenCostume : RustObjectItem(
    type = RustObjectType.ITEM_CHICKEN_COSTUME,
    name = R.string.item_chicken_costume,
    image = R.drawable.item_chicken_costume
) {

}
