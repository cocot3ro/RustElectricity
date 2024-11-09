package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

@ConsistentCopyVisibility
data class ItemBlackBerry private constructor(
    override val type: RustObjectType,
    override val name: Int,
    override val image: Int
) : RustObjectItem() {

    constructor() : this(
        type = RustObjectType.ITEM_BLACK_BERRY,
        name = R.string.item_black_berry,
        image = R.drawable.item_black_berry
    )
}
