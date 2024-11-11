package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSickle : RustObjectItem(
    type = RustObjectType.ITEM_SICKLE,
    name = R.string.item_sickle,
    image = R.drawable.item_sickle
) {

}
