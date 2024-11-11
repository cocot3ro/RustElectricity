package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSpookySpeaker : RustObjectItem(
    type = RustObjectType.ITEM_SPOOKY_SPEAKER,
    name = R.string.item_spooky_speaker,
    image = R.drawable.item_spooky_speaker
) {

}
