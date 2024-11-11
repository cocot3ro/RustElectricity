package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemLowQualityCarburetor(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_LOW_QUALITY_CARBURETOR,
    name = R.string.item_low_quality_carburetor,
    image = R.drawable.item_low_quality_carburetor
), Researcheable {

}
