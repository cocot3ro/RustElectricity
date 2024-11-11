package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRabbitMask : RustObjectItem(
    type = RustObjectType.ITEM_RABBIT_MASK,
    name = R.string.item_rabbit_mask,
    image = R.drawable.item_rabbit_mask
) {

}
