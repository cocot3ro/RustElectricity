package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBathTubPlanter : RustObjectItem(
    type = RustObjectType.ITEM_BATH_TUB_PLANTER,
    name = R.string.item_bath_tub_planter,
    image = R.drawable.item_bath_tub_planter
) {

}
