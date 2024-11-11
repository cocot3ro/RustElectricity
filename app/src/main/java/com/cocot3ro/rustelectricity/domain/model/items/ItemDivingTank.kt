package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemDivingTank : RustObjectItem(
    type = RustObjectType.ITEM_DIVING_TANK,
    name = R.string.item_diving_tank,
    image = R.drawable.item_diving_tank
) {

}
