package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemChristmasTree : RustObjectItem(
    type = RustObjectType.ITEM_CHRISTMAS_TREE,
    name = R.string.item_christmas_tree,
    image = R.drawable.item_christmas_tree
) {

}
