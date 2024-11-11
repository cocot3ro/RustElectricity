package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRatMask : RustObjectItem(
    type = RustObjectType.ITEM_RAT_MASK,
    name = R.string.item_rat_mask,
    image = R.drawable.item_rat_mask
) {

}