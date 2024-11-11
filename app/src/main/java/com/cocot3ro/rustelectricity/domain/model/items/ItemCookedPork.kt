package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCookedPork : RustObjectItem(
    type = RustObjectType.ITEM_COOKED_PORK,
    name = R.string.item_cooked_pork,
    image = R.drawable.item_cooked_pork
) {

}
