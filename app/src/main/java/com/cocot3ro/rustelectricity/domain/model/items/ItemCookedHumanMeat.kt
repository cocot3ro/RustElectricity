package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCookedHumanMeat : RustObjectItem(
    type = RustObjectType.ITEM_COOKED_HUMAN_MEAT,
    name = R.string.item_cooked_human_meat,
    image = R.drawable.item_cooked_human_meat
) {

}
