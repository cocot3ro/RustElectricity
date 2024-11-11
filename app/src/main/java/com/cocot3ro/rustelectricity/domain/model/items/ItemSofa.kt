package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSofa : RustObjectItem(
    type = RustObjectType.ITEM_SOFA,
    name = R.string.item_sofa,
    image = R.drawable.item_sofa
) {

}
