package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemTimedExplosiveCharge(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_TIMED_EXPLOSIVE_CHARGE,
    name = R.string.item_timed_explosive_charge,
    image = R.drawable.item_timed_explosive_charge
), Researcheable {

}
