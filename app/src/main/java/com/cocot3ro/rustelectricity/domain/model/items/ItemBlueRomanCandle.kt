package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBlueRomanCandle : RustObjectItem(
    type = RustObjectType.ITEM_BLUE_ROMAN_CANDLE,
    name = R.string.item_blue_roman_candle,
    image = R.drawable.item_blue_roman_candle
) {

}
