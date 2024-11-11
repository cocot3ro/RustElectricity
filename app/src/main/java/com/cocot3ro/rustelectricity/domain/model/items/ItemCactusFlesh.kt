package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCactusFlesh : RustObjectItem(
    type = RustObjectType.ITEM_CACTUS_FLESH,
    name = R.string.item_cactus_flesh,
    image = R.drawable.item_cactus_flesh
) {

}
