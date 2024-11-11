package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRawPork : RustObjectItem(
    type = RustObjectType.ITEM_RAW_PORK,
    name = R.string.item_raw_pork,
    image = R.drawable.item_raw_pork
) {

}
