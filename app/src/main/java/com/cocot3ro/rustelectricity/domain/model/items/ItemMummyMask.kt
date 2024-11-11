package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemMummyMask : RustObjectItem(
    type = RustObjectType.ITEM_MUMMY_MASK,
    name = R.string.item_mummy_mask,
    image = R.drawable.item_mummy_mask
) {

}
