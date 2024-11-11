package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemDragonMask : RustObjectItem(
    type = RustObjectType.ITEM_DRAGON_MASK,
    name = R.string.item_dragon_mask,
    image = R.drawable.item_dragon_mask
) {

}
