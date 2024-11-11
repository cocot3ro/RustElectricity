package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBlood : RustObjectItem(
    type = RustObjectType.ITEM_BLOOD,
    name = R.string.item_blood,
    image = R.drawable.item_blood
) {

}
