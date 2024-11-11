package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPlantFiber : RustObjectItem(
    type = RustObjectType.ITEM_PLANT_FIBER,
    name = R.string.item_plant_fiber,
    image = R.drawable.item_plant_fiber
) {

}
