package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemScarecrowWrap : RustObjectItem(
    type = RustObjectType.ITEM_SCARECROW_WRAP,
    name = R.string.item_scarecrow_wrap,
    image = R.drawable.item_scarecrow_wrap
) {

}
