package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSimpleLight : RustObjectItem(
    type = RustObjectType.ITEM_SIMPLE_LIGHT,
    name = R.string.item_simple_light,
    image = R.drawable.item_simple_light
) {

}
