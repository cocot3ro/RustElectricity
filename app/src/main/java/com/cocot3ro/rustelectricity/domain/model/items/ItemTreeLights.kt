package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemTreeLights : RustObjectItem(
    type = RustObjectType.ITEM_TREE_LIGHTS,
    name = R.string.item_tree_lights,
    image = R.drawable.item_tree_lights
) {

}
