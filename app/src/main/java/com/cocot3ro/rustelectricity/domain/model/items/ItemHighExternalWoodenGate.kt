package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemHighExternalWoodenGate(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_HIGH_EXTERNAL_WOODEN_GATE,
    name = R.string.item_high_external_wooden_gate,
    image = R.drawable.item_high_external_wooden_gate
), Researcheable {

}
