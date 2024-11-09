package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

@ConsistentCopyVisibility
data class ItemFestiveDoubleDoorwayGarland private constructor(
    override val type: RustObjectType,
    override val name: Int,
    override val image: Int
) : RustObjectItem() {

    constructor() : this(
        type = RustObjectType.ITEM_FESTIVE_DOUBLE_DOORWAY_GARLAND,
        name = R.string.item_festive_double_doorway_garland,
        image = R.drawable.item_festive_double_doorway_garland
    )
}
