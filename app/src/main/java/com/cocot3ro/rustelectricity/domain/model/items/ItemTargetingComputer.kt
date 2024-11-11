package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemTargetingComputer : RustObjectItem(
    type = RustObjectType.ITEM_TARGETING_COMPUTER,
    name = R.string.item_targeting_computer,
    image = R.drawable.item_targeting_computer
) {

}
