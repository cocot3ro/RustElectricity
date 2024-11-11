package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGlowingEyes : RustObjectItem(
    type = RustObjectType.ITEM_GLOWING_EYES,
    name = R.string.item_glowing_eyes,
    image = R.drawable.item_glowing_eyes
) {

}
