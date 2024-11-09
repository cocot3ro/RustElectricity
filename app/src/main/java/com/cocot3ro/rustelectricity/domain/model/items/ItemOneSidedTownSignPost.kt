package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

@ConsistentCopyVisibility
data class ItemOneSidedTownSignPost private constructor(
    override val type: RustObjectType,
    override val name: Int,
    override val image: Int
) : RustObjectItem() {

    constructor() : this(
        type = RustObjectType.ITEM_ONE_SIDED_TOWN_SIGN_POST,
        name = R.string.item_one_sided_town_sign_post,
        image = R.drawable.item_one_sided_town_sign_post
    )
}
