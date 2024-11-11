package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCornSeed : RustObjectItem(
    type = RustObjectType.ITEM_CORN_SEED,
    name = R.string.item_corn_seed,
    image = R.drawable.item_corn_seed
) {

}
