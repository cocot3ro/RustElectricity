package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPumpkinBasket : RustObjectItem(
    type = RustObjectType.ITEM_PUMPKIN_BASKET,
    name = R.string.item_pumpkin_basket,
    image = R.drawable.item_pumpkin_basket
) {

}
