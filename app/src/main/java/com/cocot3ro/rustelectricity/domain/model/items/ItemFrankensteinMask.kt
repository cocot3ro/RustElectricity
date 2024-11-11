package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemFrankensteinMask : RustObjectItem(
    type = RustObjectType.ITEM_FRANKENSTEIN_MASK,
    name = R.string.item_frankenstein_mask,
    image = R.drawable.item_frankenstein_mask
) {

}
