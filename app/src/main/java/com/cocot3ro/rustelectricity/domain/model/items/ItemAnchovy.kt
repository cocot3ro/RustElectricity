package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemAnchovy : RustObjectItem(
    type = RustObjectType.ITEM_ANCHOVY,
    name = R.string.item_anchovy,
    image = R.drawable.item_anchovy
) {

}
