package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemMiningQuarry : RustObjectItem(
    type = RustObjectType.ITEM_MINING_QUARRY,
    name = R.string.item_mining_quarry,
    image = R.drawable.item_mining_quarry
) {

}
