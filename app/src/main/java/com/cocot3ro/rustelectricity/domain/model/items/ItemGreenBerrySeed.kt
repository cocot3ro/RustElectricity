package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGreenBerrySeed : RustObjectItem(
    type = RustObjectType.ITEM_GREEN_BERRY_SEED,
    name = R.string.item_green_berry_seed,
    image = R.drawable.item_green_berry_seed
) {

}
