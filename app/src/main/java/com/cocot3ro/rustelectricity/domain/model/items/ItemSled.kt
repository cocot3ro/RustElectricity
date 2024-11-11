package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSled : RustObjectItem(
    type = RustObjectType.ITEM_SLED,
    name = R.string.item_sled,
    image = R.drawable.item_sled
) {

}
