package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSulfur : RustObjectItem(
    type = RustObjectType.ITEM_SULFUR,
    name = R.string.item_sulfur,
    image = R.drawable.item_sulfur
) {

}
