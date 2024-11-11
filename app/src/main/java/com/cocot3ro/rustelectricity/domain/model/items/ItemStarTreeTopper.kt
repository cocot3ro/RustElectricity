package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemStarTreeTopper : RustObjectItem(
    type = RustObjectType.ITEM_STAR_TREE_TOPPER,
    name = R.string.item_star_tree_topper,
    image = R.drawable.item_star_tree_topper
) {

}
