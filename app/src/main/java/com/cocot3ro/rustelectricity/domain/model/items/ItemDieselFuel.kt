package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemDieselFuel : RustObjectItem(
    type = RustObjectType.ITEM_DIESEL_FUEL,
    name = R.string.item_diesel_fuel,
    image = R.drawable.item_diesel_fuel
) {

}
