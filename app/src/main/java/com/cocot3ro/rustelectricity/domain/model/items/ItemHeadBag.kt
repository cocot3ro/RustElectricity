package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemHeadBag : RustObjectItem(
    type = RustObjectType.ITEM_HEAD_BAG,
    name = R.string.item_head_bag,
    image = R.drawable.item_head_bag
) {

}
