package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemCoffeeCanHelmet(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_COFFEE_CAN_HELMET,
    name = R.string.item_coffee_can_helmet,
    image = R.drawable.item_coffee_can_helmet
), Researcheable {

}
