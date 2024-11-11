package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemWoodenBarricadeCover(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_WOODEN_BARRICADE_COVER,
    name = R.string.item_wooden_barricade_cover,
    image = R.drawable.item_wooden_barricade_cover
), Researcheable {

}
