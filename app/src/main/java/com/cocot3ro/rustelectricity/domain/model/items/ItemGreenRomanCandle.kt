package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGreenRomanCandle : RustObjectItem(
    type = RustObjectType.ITEM_GREEN_ROMAN_CANDLE,
    name = R.string.item_green_roman_candle,
    image = R.drawable.item_green_roman_candle
) {

}
