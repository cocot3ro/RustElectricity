package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCoffin : RustObjectItem(
    type = RustObjectType.ITEM_COFFIN,
    name = R.string.item_coffin,
    image = R.drawable.item_coffin
) {

}
