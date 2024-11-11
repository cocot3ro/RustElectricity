package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCookedHorseMeat : RustObjectItem(
    type = RustObjectType.ITEM_COOKED_HORSE_MEAT,
    name = R.string.item_cooked_horse_meat,
    image = R.drawable.item_cooked_horse_meat
) {

}
