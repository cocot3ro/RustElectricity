package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

@ConsistentCopyVisibility
data class ItemDecorativePlasticCandyCanes private constructor(
    override val type: RustObjectType,
    override val name: Int,
    override val image: Int
) : RustObjectItem() {

    constructor() : this(
        type = RustObjectType.ITEM_DECORATIVE_PLASTIC_CANDY_CANES,
        name = R.string.item_decorative_plastic_candy_canes,
        image = R.drawable.item_decorative_plastic_candy_canes
    )
}
