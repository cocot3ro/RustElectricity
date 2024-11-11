package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemHempClone : RustObjectItem(
    type = RustObjectType.ITEM_HEMP_CLONE,
    name = R.string.item_hemp_clone,
    image = R.drawable.item_hemp_clone
) {

}
