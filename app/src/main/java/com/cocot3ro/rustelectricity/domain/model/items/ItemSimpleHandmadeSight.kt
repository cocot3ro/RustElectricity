package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemSimpleHandmadeSight(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_SIMPLE_HANDMADE_SIGHT,
    name = R.string.item_simple_handmade_sight,
    image = R.drawable.item_simple_handmade_sight
), Researcheable {

}
