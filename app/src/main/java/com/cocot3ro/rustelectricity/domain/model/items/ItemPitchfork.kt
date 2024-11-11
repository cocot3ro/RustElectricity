package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPitchfork : RustObjectItem(
    type = RustObjectType.ITEM_PITCHFORK,
    name = R.string.item_pitchfork,
    image = R.drawable.item_pitchfork
) {

}
