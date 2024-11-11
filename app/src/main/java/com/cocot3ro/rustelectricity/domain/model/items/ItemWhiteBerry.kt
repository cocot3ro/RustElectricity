package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWhiteBerry : RustObjectItem(
    type = RustObjectType.ITEM_WHITE_BERRY,
    name = R.string.item_white_berry,
    image = R.drawable.item_white_berry
) {

}