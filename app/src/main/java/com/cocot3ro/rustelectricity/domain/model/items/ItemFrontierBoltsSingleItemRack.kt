package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemFrontierBoltsSingleItemRack : RustObjectItem(
    type = RustObjectType.ITEM_FRONTIER_BOLTS_SINGLE_ITEM_RACK,
    name = R.string.item_frontier_bolts_single_item_rack,
    image = R.drawable.item_frontier_bolts_single_item_rack
) {

}
