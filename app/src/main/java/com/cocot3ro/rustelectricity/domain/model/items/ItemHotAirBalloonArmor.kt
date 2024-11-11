package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemHotAirBalloonArmor(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_HOT_AIR_BALLOON_ARMOR,
    name = R.string.item_hot_air_balloon_armor,
    image = R.drawable.item_hot_air_balloon_armor
), Researcheable {

}