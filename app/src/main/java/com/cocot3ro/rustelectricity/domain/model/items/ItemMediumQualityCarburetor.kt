package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemMediumQualityCarburetor(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_MEDIUM_QUALITY_CARBURETOR,
    name = R.string.item_medium_quality_carburetor,
    image = R.drawable.item_medium_quality_carburetor
), Researcheable {

}
