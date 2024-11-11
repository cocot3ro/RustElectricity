package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemHugeWoodenSign(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_HUGE_WOODEN_SIGN,
    name = R.string.item_huge_wooden_sign,
    image = R.drawable.item_huge_wooden_sign
), Researcheable {

}
