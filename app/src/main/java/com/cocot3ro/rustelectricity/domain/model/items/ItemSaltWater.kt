package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSaltWater : RustObjectItem(
    type = RustObjectType.ITEM_SALT_WATER,
    name = R.string.item_salt_water,
    image = R.drawable.item_salt_water
) {

}
