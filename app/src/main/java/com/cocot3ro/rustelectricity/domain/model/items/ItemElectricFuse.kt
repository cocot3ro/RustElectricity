package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemElectricFuse : RustObjectItem(
    type = RustObjectType.ITEM_ELECTRIC_FUSE,
    name = R.string.item_electric_fuse,
    image = R.drawable.item_electric_fuse
) {

}
