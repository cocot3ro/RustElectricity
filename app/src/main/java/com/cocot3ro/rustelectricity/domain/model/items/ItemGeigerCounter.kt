package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGeigerCounter : RustObjectItem(
    type = RustObjectType.ITEM_GEIGER_COUNTER,
    name = R.string.item_geiger_counter,
    image = R.drawable.item_geiger_counter
) {

}
