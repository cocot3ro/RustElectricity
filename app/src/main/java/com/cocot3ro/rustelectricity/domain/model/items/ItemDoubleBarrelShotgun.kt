package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemDoubleBarrelShotgun(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_DOUBLE_BARREL_SHOTGUN,
    name = R.string.item_double_barrel_shotgun,
    image = R.drawable.item_double_barrel_shotgun
), Researcheable {

}
