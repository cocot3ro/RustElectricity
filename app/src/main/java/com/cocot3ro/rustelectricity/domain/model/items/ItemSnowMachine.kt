package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSnowMachine : RustObjectItem(
    type = RustObjectType.ITEM_SNOW_MACHINE,
    name = R.string.item_snow_machine,
    image = R.drawable.item_snow_machine
) {

}
