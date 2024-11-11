package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemSheetMetalDoubleDoor(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_SHEET_METAL_DOUBLE_DOOR,
    name = R.string.item_sheet_metal_double_door,
    image = R.drawable.item_sheet_metal_double_door
), Researcheable {

}