package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemChocolateBar : RustObjectItem(
    type = RustObjectType.ITEM_CHOCOLATE_BAR,
    name = R.string.item_chocolate_bar,
    image = R.drawable.item_chocolate_bar
) {

}
