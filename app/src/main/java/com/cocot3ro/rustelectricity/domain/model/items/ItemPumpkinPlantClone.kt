package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPumpkinPlantClone : RustObjectItem(
    type = RustObjectType.ITEM_PUMPKIN_PLANT_CLONE,
    name = R.string.item_pumpkin_plant_clone,
    image = R.drawable.item_pumpkin_plant_clone
) {

}
