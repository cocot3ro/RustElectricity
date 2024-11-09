package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

@ConsistentCopyVisibility
data class ItemMediumFrankensteinTorso private constructor(
    override val type: RustObjectType,
    override val name: Int,
    override val image: Int
) : RustObjectItem() {

    constructor() : this(
        type = RustObjectType.ITEM_MEDIUM_FRANKENSTEIN_TORSO,
        name = R.string.item_medium_frankenstein_torso,
        image = R.drawable.item_medium_frankenstein_torso
    )
}
