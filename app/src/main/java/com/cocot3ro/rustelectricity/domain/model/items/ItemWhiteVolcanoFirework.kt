package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWhiteVolcanoFirework : RustObjectItem(
    type = RustObjectType.ITEM_WHITE_VOLCANO_FIREWORK,
    name = R.string.item_white_volcano_firework,
    image = R.drawable.item_white_volcano_firework
) {

}