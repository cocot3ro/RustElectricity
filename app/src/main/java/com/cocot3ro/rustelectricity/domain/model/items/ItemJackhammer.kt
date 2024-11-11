package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemJackhammer : RustObjectItem(
    type = RustObjectType.ITEM_JACKHAMMER,
    name = R.string.item_jackhammer,
    image = R.drawable.item_jackhammer
) {

}
