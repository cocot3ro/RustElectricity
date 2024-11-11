package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemRoadsignHorseArmor(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_ROADSIGN_HORSE_ARMOR,
    name = R.string.item_roadsign_horse_armor,
    image = R.drawable.item_roadsign_horse_armor
), Researcheable {

}
