package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBleach : RustObjectItem(
    type = RustObjectType.ITEM_BLEACH,
    name = R.string.item_bleach,
    image = R.drawable.item_bleach
) {

}
