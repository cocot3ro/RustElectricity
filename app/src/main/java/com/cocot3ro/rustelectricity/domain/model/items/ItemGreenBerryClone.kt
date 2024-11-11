package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGreenBerryClone : RustObjectItem(
    type = RustObjectType.ITEM_GREEN_BERRY_CLONE,
    name = R.string.item_green_berry_clone,
    image = R.drawable.item_green_berry_clone
) {

}
