package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemTarp : RustObjectItem(
    type = RustObjectType.ITEM_TARP,
    name = R.string.item_tarp,
    image = R.drawable.item_tarp
) {

}
