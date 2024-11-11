package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemStrobeLight : RustObjectItem(
    type = RustObjectType.ITEM_STROBE_LIGHT,
    name = R.string.item_strobe_light,
    image = R.drawable.item_strobe_light
) {

}
