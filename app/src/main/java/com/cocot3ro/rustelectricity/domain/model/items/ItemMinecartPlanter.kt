package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemMinecartPlanter : RustObjectItem(
    type = RustObjectType.ITEM_MINECART_PLANTER,
    name = R.string.item_minecart_planter,
    image = R.drawable.item_minecart_planter
) {

}
