package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemSemiAutomaticRifle(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_SEMI_AUTOMATIC_RIFLE,
    name = R.string.item_semi_automatic_rifle,
    image = R.drawable.item_semi_automatic_rifle
), Researcheable {

}