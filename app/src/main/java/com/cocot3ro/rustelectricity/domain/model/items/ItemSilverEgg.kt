package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSilverEgg : RustObjectItem(
    type = RustObjectType.ITEM_SILVER_EGG,
    name = R.string.item_silver_egg,
    image = R.drawable.item_silver_egg
) {

}
