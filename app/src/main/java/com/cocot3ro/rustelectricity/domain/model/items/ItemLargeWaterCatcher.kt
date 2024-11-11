package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemLargeWaterCatcher(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_LARGE_WATER_CATCHER,
    name = R.string.item_large_water_catcher,
    image = R.drawable.item_large_water_catcher
), Researcheable {

}
