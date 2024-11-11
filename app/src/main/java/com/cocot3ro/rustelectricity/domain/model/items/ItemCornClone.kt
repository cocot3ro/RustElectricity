package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCornClone : RustObjectItem(
    type = RustObjectType.ITEM_CORN_CLONE,
    name = R.string.item_corn_clone,
    image = R.drawable.item_corn_clone
) {

}
