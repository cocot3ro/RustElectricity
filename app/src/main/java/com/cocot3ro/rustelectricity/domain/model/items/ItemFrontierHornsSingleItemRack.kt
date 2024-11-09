package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

@ConsistentCopyVisibility
data class ItemFrontierHornsSingleItemRack private constructor(
    override val type: RustObjectType,
    override val name: Int,
    override val image: Int
) : RustObjectItem() {

    constructor() : this(
        type = RustObjectType.ITEM_FRONTIER_HORNS_SINGLE_ITEM_RACK,
        name = R.string.item_frontier_horns_single_item_rack,
        image = R.drawable.item_frontier_horns_single_item_rack
    )
}
