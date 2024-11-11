package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGingerbreadSuit : RustObjectItem(
    type = RustObjectType.ITEM_GINGERBREAD_SUIT,
    name = R.string.item_gingerbread_suit,
    image = R.drawable.item_gingerbread_suit
) {

}
