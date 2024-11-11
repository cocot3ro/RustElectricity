package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSardine : RustObjectItem(
    type = RustObjectType.ITEM_SARDINE,
    name = R.string.item_sardine,
    image = R.drawable.item_sardine
) {

}
