package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCookedBearMeat : RustObjectItem(
    type = RustObjectType.ITEM_COOKED_BEAR_MEAT,
    name = R.string.item_cooked_bear_meat,
    image = R.drawable.item_cooked_bear_meat
) {

}