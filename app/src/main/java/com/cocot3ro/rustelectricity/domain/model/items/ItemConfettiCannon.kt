package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemConfettiCannon : RustObjectItem(
    type = RustObjectType.ITEM_CONFETTI_CANNON,
    name = R.string.item_confetti_cannon,
    image = R.drawable.item_confetti_cannon
) {

}
