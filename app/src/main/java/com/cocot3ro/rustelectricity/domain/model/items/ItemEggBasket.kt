package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemEggBasket : RustObjectItem(
    type = RustObjectType.ITEM_EGG_BASKET,
    name = R.string.item_egg_basket,
    image = R.drawable.item_egg_basket
) {

}
