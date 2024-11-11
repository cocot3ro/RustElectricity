package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemTwoSidedHangingSign : RustObjectItem(
    type = RustObjectType.ITEM_TWO_SIDED_HANGING_SIGN,
    name = R.string.item_two_sided_hanging_sign,
    image = R.drawable.item_two_sided_hanging_sign
) {

}
