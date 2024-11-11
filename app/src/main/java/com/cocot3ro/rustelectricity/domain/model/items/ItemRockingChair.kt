package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRockingChair : RustObjectItem(
    type = RustObjectType.ITEM_ROCKING_CHAIR,
    name = R.string.item_rocking_chair,
    image = R.drawable.item_rocking_chair
) {

}
