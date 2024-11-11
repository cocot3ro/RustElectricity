package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGoldEgg : RustObjectItem(
    type = RustObjectType.ITEM_GOLD_EGG,
    name = R.string.item_gold_egg,
    image = R.drawable.item_gold_egg
) {

}
