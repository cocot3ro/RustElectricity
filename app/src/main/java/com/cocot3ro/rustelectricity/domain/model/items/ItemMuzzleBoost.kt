package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

@ConsistentCopyVisibility
data class ItemMuzzleBoost private constructor(
    override val type: RustObjectType,
    override val name: Int,
    override val image: Int,
    override val isBlueprint: Boolean
) : RustObjectItem() , Researcheable{

    constructor(isBlueprint: Boolean = false) : this(
        type = RustObjectType.ITEM_MUZZLE_BOOST,
        name = R.string.item_muzzle_boost,
        image = R.drawable.item_muzzle_boost,
        isBlueprint = isBlueprint
    )
}
