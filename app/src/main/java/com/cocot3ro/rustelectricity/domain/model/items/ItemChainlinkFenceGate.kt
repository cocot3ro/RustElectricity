package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemChainlinkFenceGate(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_CHAINLINK_FENCE_GATE,
    name = R.string.item_chainlink_fence_gate,
    image = R.drawable.item_chainlink_fence_gate
), Researcheable {

}
