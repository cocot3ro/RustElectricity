package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemFogger3000 : RustObjectItem(
    type = RustObjectType.ITEM_FOGGER_3000,
    name = R.string.item_fogger_3000,
    image = R.drawable.item_fogger_3000
) {

}
