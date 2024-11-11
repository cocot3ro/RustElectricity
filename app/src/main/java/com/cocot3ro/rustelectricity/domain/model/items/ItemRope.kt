package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRope : RustObjectItem(
    type = RustObjectType.ITEM_ROPE,
    name = R.string.item_rope,
    image = R.drawable.item_rope
) {

}
