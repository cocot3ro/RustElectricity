package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRedVolcanoFirework : RustObjectItem(
    type = RustObjectType.ITEM_RED_VOLCANO_FIREWORK,
    name = R.string.item_red_volcano_firework,
    image = R.drawable.item_red_volcano_firework
) {

}
