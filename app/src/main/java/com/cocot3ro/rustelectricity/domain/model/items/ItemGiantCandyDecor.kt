package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGiantCandyDecor : RustObjectItem(
    type = RustObjectType.ITEM_GIANT_CANDY_DECOR,
    name = R.string.item_giant_candy_decor,
    image = R.drawable.item_giant_candy_decor
) {

}