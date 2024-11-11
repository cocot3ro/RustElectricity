package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBlueberries : RustObjectItem(
    type = RustObjectType.ITEM_BLUEBERRIES,
    name = R.string.item_blueberries,
    image = R.drawable.item_blueberries
) {

}
