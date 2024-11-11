package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemScarecrow : RustObjectItem(
    type = RustObjectType.ITEM_SCARECROW,
    name = R.string.item_scarecrow,
    image = R.drawable.item_scarecrow
) {

}
