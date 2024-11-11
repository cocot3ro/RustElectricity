package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemHempSeed : RustObjectItem(
    type = RustObjectType.ITEM_HEMP_SEED,
    name = R.string.item_hemp_seed,
    image = R.drawable.item_hemp_seed
) {

}
