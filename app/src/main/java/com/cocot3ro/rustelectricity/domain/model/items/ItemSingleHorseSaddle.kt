package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSingleHorseSaddle : RustObjectItem(
    type = RustObjectType.ITEM_SINGLE_HORSE_SADDLE,
    name = R.string.item_single_horse_saddle,
    image = R.drawable.item_single_horse_saddle
) {

}
