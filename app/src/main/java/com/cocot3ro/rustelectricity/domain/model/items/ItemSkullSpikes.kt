package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSkullSpikes : RustObjectItem(
    type = RustObjectType.ITEM_SKULL_SPIKES,
    name = R.string.item_skull_spikes,
    image = R.drawable.item_skull_spikes
) {

}