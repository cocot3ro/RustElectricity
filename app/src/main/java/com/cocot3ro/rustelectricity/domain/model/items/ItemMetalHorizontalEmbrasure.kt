package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemMetalHorizontalEmbrasure(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_METAL_HORIZONTAL_EMBRASURE,
    name = R.string.item_metal_horizontal_embrasure,
    image = R.drawable.item_metal_horizontal_embrasure
), Researcheable {

}
