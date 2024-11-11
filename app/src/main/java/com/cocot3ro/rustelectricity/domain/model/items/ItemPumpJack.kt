package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPumpJack : RustObjectItem(
    type = RustObjectType.ITEM_PUMP_JACK,
    name = R.string.item_pump_jack,
    image = R.drawable.item_pump_jack
) {

}
