package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPotatoSeed : RustObjectItem(
    type = RustObjectType.ITEM_POTATO_SEED,
    name = R.string.item_potato_seed,
    image = R.drawable.item_potato_seed
) {

}
