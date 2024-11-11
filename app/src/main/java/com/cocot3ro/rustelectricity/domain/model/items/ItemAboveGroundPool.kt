package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemAboveGroundPool : RustObjectItem(
    type = RustObjectType.ITEM_ABOVE_GROUND_POOL,
    name = R.string.item_above_ground_pool,
    image = R.drawable.item_above_ground_pool
) {

}
