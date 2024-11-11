package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemLegacyWoodShelter(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_LEGACY_WOOD_SHELTER,
    name = R.string.item_legacy_wood_shelter,
    image = R.drawable.item_legacy_wood_shelter
), Researcheable {

}
