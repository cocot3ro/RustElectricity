package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemNvgmScientistSuit : RustObjectItem(
    type = RustObjectType.ITEM_NVGM_SCIENTIST_SUIT,
    name = R.string.item_nvgm_scientist_suit,
    image = R.drawable.item_nvgm_scientist_suit
) {

}
