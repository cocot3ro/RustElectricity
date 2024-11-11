package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemHighQualityHorseShoes(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_HIGH_QUALITY_HORSE_SHOES,
    name = R.string.item_high_quality_horse_shoes,
    image = R.drawable.item_high_quality_horse_shoes
), Researcheable {

}
