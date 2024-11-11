package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPickles : RustObjectItem(
    type = RustObjectType.ITEM_PICKLES,
    name = R.string.item_pickles,
    image = R.drawable.item_pickles
) {

}
