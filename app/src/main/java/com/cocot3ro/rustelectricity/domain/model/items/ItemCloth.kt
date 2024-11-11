package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCloth : RustObjectItem(
    type = RustObjectType.ITEM_CLOTH,
    name = R.string.item_cloth,
    image = R.drawable.item_cloth
) {

}
