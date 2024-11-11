package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemReindeerAntlers : RustObjectItem(
    type = RustObjectType.ITEM_REINDEER_ANTLERS,
    name = R.string.item_reindeer_antlers,
    image = R.drawable.item_reindeer_antlers
) {

}
