package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemHighVelocityRocket(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_HIGH_VELOCITY_ROCKET,
    name = R.string.item_high_velocity_rocket,
    image = R.drawable.item_high_velocity_rocket
), Researcheable {

}
