package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class Item12GaugeIncendiaryShell(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_12_GAUGE_INCENDIARY_SHELL,
    name = R.string.item_12_gauge_incendiary_shell,
    image = R.drawable.item_12_gauge_incendiary_shell
), Researcheable {

}