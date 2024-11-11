package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCrudeOil : RustObjectItem(
    type = RustObjectType.ITEM_CRUDE_OIL,
    name = R.string.item_crude_oil,
    image = R.drawable.item_crude_oil
) {

}
