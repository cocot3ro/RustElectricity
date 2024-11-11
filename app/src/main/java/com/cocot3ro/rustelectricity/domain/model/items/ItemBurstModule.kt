package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBurstModule : RustObjectItem(
    type = RustObjectType.ITEM_BURST_MODULE,
    name = R.string.item_burst_module,
    image = R.drawable.item_burst_module
) {

}
