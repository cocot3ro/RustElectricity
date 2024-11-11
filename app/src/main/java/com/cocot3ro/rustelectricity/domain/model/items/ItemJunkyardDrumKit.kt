package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemJunkyardDrumKit(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_JUNKYARD_DRUM_KIT,
    name = R.string.item_junkyard_drum_kit,
    image = R.drawable.item_junkyard_drum_kit
), Researcheable {

}
