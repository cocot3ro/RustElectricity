package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPotato : RustObjectItem(
    type = RustObjectType.ITEM_POTATO,
    name = R.string.item_potato,
    image = R.drawable.item_potato
) {

}
