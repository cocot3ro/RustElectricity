package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSuperStocking : RustObjectItem(
    type = RustObjectType.ITEM_SUPER_STOCKING,
    name = R.string.item_super_stocking,
    image = R.drawable.item_super_stocking
) {

}
