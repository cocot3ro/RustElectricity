package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSmallCandleSet : RustObjectItem(
    type = RustObjectType.ITEM_SMALL_CANDLE_SET,
    name = R.string.item_small_candle_set,
    image = R.drawable.item_small_candle_set
) {

}
