package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemAntiRadiationPills : RustObjectItem(
    type = RustObjectType.ITEM_ANTI_RADIATION_PILLS,
    name = R.string.item_anti_radiation_pills,
    image = R.drawable.item_anti_radiation_pills
) {

}