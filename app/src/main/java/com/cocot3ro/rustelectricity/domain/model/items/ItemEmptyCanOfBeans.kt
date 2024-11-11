package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemEmptyCanOfBeans(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_EMPTY_CAN_OF_BEANS,
    name = R.string.item_empty_can_of_beans,
    image = R.drawable.item_empty_can_of_beans
), Researcheable {

}
