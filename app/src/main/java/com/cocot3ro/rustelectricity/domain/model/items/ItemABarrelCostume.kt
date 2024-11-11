package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemABarrelCostume : RustObjectItem(
    type = RustObjectType.ITEM_A_BARREL_COSTUME,
    name = R.string.item_a_barrel_costume,
    image = R.drawable.item_a_barrel_costume
) {

}
