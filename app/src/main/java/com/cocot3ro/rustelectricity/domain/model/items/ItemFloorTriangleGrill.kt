package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemFloorTriangleGrill(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_FLOOR_TRIANGLE_GRILL,
    name = R.string.item_floor_triangle_grill,
    image = R.drawable.item_floor_triangle_grill
), Researcheable {

}
