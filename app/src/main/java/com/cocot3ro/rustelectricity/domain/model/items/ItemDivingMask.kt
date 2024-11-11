package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemDivingMask : RustObjectItem(
    type = RustObjectType.ITEM_DIVING_MASK,
    name = R.string.item_diving_mask,
    image = R.drawable.item_diving_mask
) {

}
