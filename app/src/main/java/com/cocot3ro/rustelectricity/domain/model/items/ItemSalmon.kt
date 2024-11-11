package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSalmon : RustObjectItem(
    type = RustObjectType.ITEM_SALMON,
    name = R.string.item_salmon,
    image = R.drawable.item_salmon
) {

}
