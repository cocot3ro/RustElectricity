package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPurpleSunglasses : RustObjectItem(
    type = RustObjectType.ITEM_PURPLE_SUNGLASSES,
    name = R.string.item_purple_sunglasses,
    image = R.drawable.item_purple_sunglasses
) {

}
