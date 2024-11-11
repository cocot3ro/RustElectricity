package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWaterwellNpcJumpsuit : RustObjectItem(
    type = RustObjectType.ITEM_WATERWELL_NPC_JUMPSUIT,
    name = R.string.item_waterwell_npc_jumpsuit,
    image = R.drawable.item_waterwell_npc_jumpsuit
) {

}
