package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemLargeNeonSign : RustObjectItem(
    type = RustObjectType.ITEM_LARGE_NEON_SIGN,
    name = R.string.item_large_neon_sign,
    image = R.drawable.item_large_neon_sign
) {

}
