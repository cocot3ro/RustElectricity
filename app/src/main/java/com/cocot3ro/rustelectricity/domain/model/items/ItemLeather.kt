package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemLeather : RustObjectItem(
    type = RustObjectType.ITEM_LEATHER,
    name = R.string.item_leather,
    image = R.drawable.item_leather
) {

}
