package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemHumanSkull : RustObjectItem(
    type = RustObjectType.ITEM_HUMAN_SKULL,
    name = R.string.item_human_skull,
    image = R.drawable.item_human_skull
) {

}
