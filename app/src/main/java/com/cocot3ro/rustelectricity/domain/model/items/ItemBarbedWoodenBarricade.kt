package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemBarbedWoodenBarricade(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_BARBED_WOODEN_BARRICADE,
    name = R.string.item_barbed_wooden_barricade,
    image = R.drawable.item_barbed_wooden_barricade
), Researcheable {

}
