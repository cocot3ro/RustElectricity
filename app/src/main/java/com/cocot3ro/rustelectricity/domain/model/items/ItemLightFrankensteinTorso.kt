package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemLightFrankensteinTorso : RustObjectItem(
    type = RustObjectType.ITEM_LIGHT_FRANKENSTEIN_TORSO,
    name = R.string.item_light_frankenstein_torso,
    image = R.drawable.item_light_frankenstein_torso
) {

}
