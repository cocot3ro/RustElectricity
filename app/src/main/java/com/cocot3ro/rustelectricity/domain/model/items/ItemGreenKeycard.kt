package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGreenKeycard : RustObjectItem(
    type = RustObjectType.ITEM_GREEN_KEYCARD,
    name = R.string.item_green_keycard,
    image = R.drawable.item_green_keycard
) {

}