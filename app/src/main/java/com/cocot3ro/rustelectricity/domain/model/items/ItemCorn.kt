package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCorn : RustObjectItem(
    type = RustObjectType.ITEM_CORN,
    name = R.string.item_corn,
    image = R.drawable.item_corn
) {

}
