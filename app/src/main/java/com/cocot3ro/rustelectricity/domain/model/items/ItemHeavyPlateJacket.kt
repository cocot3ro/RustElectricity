package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemHeavyPlateJacket(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_HEAVY_PLATE_JACKET,
    name = R.string.item_heavy_plate_jacket,
    image = R.drawable.item_heavy_plate_jacket
), Researcheable {

}
