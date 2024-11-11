package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemStones : RustObjectItem(
    type = RustObjectType.ITEM_STONES,
    name = R.string.item_stones,
    image = R.drawable.item_stones
) {

}
