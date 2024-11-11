package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemTigerMask : RustObjectItem(
    type = RustObjectType.ITEM_TIGER_MASK,
    name = R.string.item_tiger_mask,
    image = R.drawable.item_tiger_mask
) {

}
