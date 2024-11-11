package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemLowQualityCrankshaft(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_LOW_QUALITY_CRANKSHAFT,
    name = R.string.item_low_quality_crankshaft,
    image = R.drawable.item_low_quality_crankshaft
), Researcheable {

}
