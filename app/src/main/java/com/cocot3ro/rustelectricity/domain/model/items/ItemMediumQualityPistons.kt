package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemMediumQualityPistons(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_MEDIUM_QUALITY_PISTONS,
    name = R.string.item_medium_quality_pistons,
    image = R.drawable.item_medium_quality_pistons
), Researcheable {

}