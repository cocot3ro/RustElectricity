package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

@ConsistentCopyVisibility
data class ItemTwitchRivalsTrophy2023 private constructor(
    override val type: RustObjectType,
    override val name: Int,
    override val image: Int
) : RustObjectItem() {

    constructor() : this(
        type = RustObjectType.ITEM_TWITCH_RIVALS_TROPHY_2023,
        name = R.string.item_twitch_rivals_trophy_2023,
        image = R.drawable.item_twitch_rivals_trophy_2023
    )
}
