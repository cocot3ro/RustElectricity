package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemNewYearGong : RustObjectItem(
    type = RustObjectType.ITEM_NEW_YEAR_GONG,
    name = R.string.item_new_year_gong,
    image = R.drawable.item_new_year_gong
) {

}
