package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemIncendiaryPistolBullet(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_INCENDIARY_PISTOL_BULLET,
    name = R.string.item_incendiary_pistol_bullet,
    image = R.drawable.item_incendiary_pistol_bullet
), Researcheable {

}
