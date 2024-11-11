package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemHomingMissileLauncher(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_HOMING_MISSILE_LAUNCHER,
    name = R.string.item_homing_missile_launcher,
    image = R.drawable.item_homing_missile_launcher
), Researcheable {

}
