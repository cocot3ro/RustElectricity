package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemIncendiary556RifleAmmo(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_INCENDIARY_5_56_RIFLE_AMMO,
    name = R.string.item_incendiary_5_56_rifle_ammo,
    image = R.drawable.item_incendiary_5_56_rifle_ammo
), Researcheable {

}
