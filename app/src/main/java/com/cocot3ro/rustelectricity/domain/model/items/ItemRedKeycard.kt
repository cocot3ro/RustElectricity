package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRedKeycard : RustObjectItem(
    type = RustObjectType.ITEM_RED_KEYCARD,
    name = R.string.item_red_keycard,
    image = R.drawable.item_red_keycard
) {

}
