package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBlackRaspberries : RustObjectItem(
    type = RustObjectType.ITEM_BLACK_RASPBERRIES,
    name = R.string.item_black_raspberries,
    image = R.drawable.item_black_raspberries
) {

}
