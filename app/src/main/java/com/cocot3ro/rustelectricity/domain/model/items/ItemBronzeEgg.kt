package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBronzeEgg : RustObjectItem(
    type = RustObjectType.ITEM_BRONZE_EGG,
    name = R.string.item_bronze_egg,
    image = R.drawable.item_bronze_egg
) {

}
