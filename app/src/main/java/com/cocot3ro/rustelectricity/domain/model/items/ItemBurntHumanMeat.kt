package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBurntHumanMeat : RustObjectItem(
    type = RustObjectType.ITEM_BURNT_HUMAN_MEAT,
    name = R.string.item_burnt_human_meat,
    image = R.drawable.item_burnt_human_meat
) {

}
