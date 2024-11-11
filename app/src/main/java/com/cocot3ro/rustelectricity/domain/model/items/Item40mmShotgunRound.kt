package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object Item40mmShotgunRound : RustObjectItem(
    type = RustObjectType.ITEM_40MM_SHOTGUN_ROUND,
    name = R.string.item_40mm_shotgun_round,
    image = R.drawable.item_40mm_shotgun_round
) {

}