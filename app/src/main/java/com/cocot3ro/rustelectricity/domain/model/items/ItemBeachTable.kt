package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBeachTable : RustObjectItem(
    type = RustObjectType.ITEM_BEACH_TABLE,
    name = R.string.item_beach_table,
    image = R.drawable.item_beach_table
) {

}
