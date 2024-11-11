package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemTechTrash : RustObjectItem(
    type = RustObjectType.ITEM_TECH_TRASH,
    name = R.string.item_tech_trash,
    image = R.drawable.item_tech_trash
) {

}
