package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

@ConsistentCopyVisibility
data class ItemHitchAndTrough private constructor(
    override val type: RustObjectType,
    override val name: Int,
    override val image: Int,
    override val isBlueprint: Boolean
) : RustObjectItem(), Researcheable {

    constructor(isBlueprint: Boolean = false) : this(
        type = RustObjectType.ITEM_HITCH_AND_TROUGH,
        name = R.string.item_hitch_and_trough,
        image = R.drawable.item_hitch_and_trough,
        isBlueprint = isBlueprint
    )
}
