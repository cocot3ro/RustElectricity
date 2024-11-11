package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRedRomanCandle : RustObjectItem(
    type = RustObjectType.ITEM_RED_ROMAN_CANDLE,
    name = R.string.item_red_roman_candle,
    image = R.drawable.item_red_roman_candle
) {

}
