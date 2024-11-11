package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSupplySignal : RustObjectItem(
    type = RustObjectType.ITEM_SUPPLY_SIGNAL,
    name = R.string.item_supply_signal,
    image = R.drawable.item_supply_signal
) {

}
