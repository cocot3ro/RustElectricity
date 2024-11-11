package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSmallLootBag : RustObjectItem(
    type = RustObjectType.ITEM_SMALL_LOOT_BAG,
    name = R.string.item_small_loot_bag,
    image = R.drawable.item_small_loot_bag
) {

}
