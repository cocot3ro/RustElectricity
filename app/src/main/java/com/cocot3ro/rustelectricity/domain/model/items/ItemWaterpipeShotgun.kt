package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemWaterpipeShotgun(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_WATERPIPE_SHOTGUN,
    name = R.string.item_waterpipe_shotgun,
    image = R.drawable.item_waterpipe_shotgun
), Researcheable {

}
