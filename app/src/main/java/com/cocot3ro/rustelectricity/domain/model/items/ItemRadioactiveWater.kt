package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRadioactiveWater : RustObjectItem(
    type = RustObjectType.ITEM_RADIOACTIVE_WATER,
    name = R.string.item_radioactive_water,
    image = R.drawable.item_radioactive_water
) {

}
