package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemStrengthenedGlassWindow(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_STRENGTHENED_GLASS_WINDOW,
    name = R.string.item_strengthened_glass_window,
    image = R.drawable.item_strengthened_glass_window
), Researcheable {

}
