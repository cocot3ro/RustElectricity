package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGreenBerry : RustObjectItem(
    type = RustObjectType.ITEM_GREEN_BERRY,
    name = R.string.item_green_berry,
    image = R.drawable.item_green_berry
) {

}
