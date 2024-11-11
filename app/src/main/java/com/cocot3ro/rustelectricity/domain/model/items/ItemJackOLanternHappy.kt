package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemJackOLanternHappy : RustObjectItem(
    type = RustObjectType.ITEM_JACK_O_LANTERN_HAPPY,
    name = R.string.item_jack_o_lantern_happy,
    image = R.drawable.item_jack_o_lantern_happy
) {

}
