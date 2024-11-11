package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemAdvancedHealingTea : RustObjectItem(
    type = RustObjectType.ITEM_ADVANCED_HEALING_TEA,
    name = R.string.item_advanced_healing_tea,
    image = R.drawable.item_advanced_healing_tea
) {

}
