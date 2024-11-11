package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemLargeAnimatedNeonSign : RustObjectItem(
    type = RustObjectType.ITEM_LARGE_ANIMATED_NEON_SIGN,
    name = R.string.item_large_animated_neon_sign,
    image = R.drawable.item_large_animated_neon_sign
) {

}
