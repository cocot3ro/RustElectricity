package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRawHumanMeat : RustObjectItem(
    type = RustObjectType.ITEM_RAW_HUMAN_MEAT,
    name = R.string.item_raw_human_meat,
    image = R.drawable.item_raw_human_meat
) {

}
