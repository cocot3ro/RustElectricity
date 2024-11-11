package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBlueBerry : RustObjectItem(
    type = RustObjectType.ITEM_BLUE_BERRY,
    name = R.string.item_blue_berry,
    image = R.drawable.item_blue_berry
) {

}