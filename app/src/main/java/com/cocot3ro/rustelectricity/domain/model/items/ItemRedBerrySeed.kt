package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRedBerrySeed : RustObjectItem(
    type = RustObjectType.ITEM_RED_BERRY_SEED,
    name = R.string.item_red_berry_seed,
    image = R.drawable.item_red_berry_seed
) {

}
