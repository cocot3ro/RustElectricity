package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBlackBerryClone : RustObjectItem(
    type = RustObjectType.ITEM_BLACK_BERRY_CLONE,
    name = R.string.item_black_berry_clone,
    image = R.drawable.item_black_berry_clone
) {

}
