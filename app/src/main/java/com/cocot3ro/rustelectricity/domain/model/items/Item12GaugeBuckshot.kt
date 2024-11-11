package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class Item12GaugeBuckshot(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_12_GAUGE_BUCKSHOT,
    name = R.string.item_12_gauge_buckshot,
    image = R.drawable.item_12_gauge_buckshot
), Researcheable {

}
