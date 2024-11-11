package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemVampireStake : RustObjectItem(
    type = RustObjectType.ITEM_VAMPIRE_STAKE,
    name = R.string.item_vampire_stake,
    image = R.drawable.item_vampire_stake
) {

}
