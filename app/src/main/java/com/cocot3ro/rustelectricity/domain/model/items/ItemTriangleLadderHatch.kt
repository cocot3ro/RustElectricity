package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemTriangleLadderHatch(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_TRIANGLE_LADDER_HATCH,
    name = R.string.item_triangle_ladder_hatch,
    image = R.drawable.item_triangle_ladder_hatch
), Researcheable {

}
