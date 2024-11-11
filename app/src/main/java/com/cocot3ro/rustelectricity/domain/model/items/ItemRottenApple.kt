package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRottenApple : RustObjectItem(
    type = RustObjectType.ITEM_ROTTEN_APPLE,
    name = R.string.item_rotten_apple,
    image = R.drawable.item_rotten_apple
) {

}