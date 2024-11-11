package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemSemiAutomaticPistol(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_SEMI_AUTOMATIC_PISTOL,
    name = R.string.item_semi_automatic_pistol,
    image = R.drawable.item_semi_automatic_pistol
), Researcheable {

}
