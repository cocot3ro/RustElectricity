package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemFertilizer : RustObjectItem(
    type = RustObjectType.ITEM_FERTILIZER,
    name = R.string.item_fertilizer,
    image = R.drawable.item_fertilizer
) {

}
