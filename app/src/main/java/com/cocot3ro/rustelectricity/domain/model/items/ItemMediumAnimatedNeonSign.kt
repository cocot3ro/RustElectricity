package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemMediumAnimatedNeonSign : RustObjectItem(
    type = RustObjectType.ITEM_MEDIUM_ANIMATED_NEON_SIGN,
    name = R.string.item_medium_animated_neon_sign,
    image = R.drawable.item_medium_animated_neon_sign
) {

}
