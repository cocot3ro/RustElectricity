package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

@ConsistentCopyVisibility
data class ItemExplosive556RifleAmmo private constructor(
    override val type: RustObjectType,
    override val name: Int,
    override val image: Int,
    override val isBlueprint: Boolean
) : RustObjectItem(), Researcheable {

    constructor(isBlueprint: Boolean = false) : this(
        type = RustObjectType.ITEM_EXPLOSIVE_5_56_RIFLE_AMMO,
        name = R.string.item_explosive_5_56_rifle_ammo,
        image = R.drawable.item_explosive_5_56_rifle_ammo,
        isBlueprint = isBlueprint
    )
}
