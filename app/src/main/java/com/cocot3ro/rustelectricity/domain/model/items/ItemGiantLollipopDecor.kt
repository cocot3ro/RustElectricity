package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

@ConsistentCopyVisibility
data class ItemGiantLollipopDecor private constructor(
    override val type: RustObjectType,
    override val name: Int,
    override val image: Int
) : RustObjectItem() {

    constructor() : this(
        type = RustObjectType.ITEM_GIANT_LOLLIPOP_DECOR,
        name = R.string.item_giant_lollipop_decor,
        image = R.drawable.item_giant_lollipop_decor
    )
}
