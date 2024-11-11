package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPaintedEgg : RustObjectItem(
    type = RustObjectType.ITEM_PAINTED_EGG,
    name = R.string.item_painted_egg,
    image = R.drawable.item_painted_egg
) {

}
