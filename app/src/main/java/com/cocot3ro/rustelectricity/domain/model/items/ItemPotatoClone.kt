package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPotatoClone : RustObjectItem(
    type = RustObjectType.ITEM_POTATO_CLONE,
    name = R.string.item_potato_clone,
    image = R.drawable.item_potato_clone
) {

}
