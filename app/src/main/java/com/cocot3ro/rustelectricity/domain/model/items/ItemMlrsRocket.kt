package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemMlrsRocket : RustObjectItem(
    type = RustObjectType.ITEM_MLRS_ROCKET,
    name = R.string.item_mlrs_rocket,
    image = R.drawable.item_mlrs_rocket
) {

}
