package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCursedCauldron : RustObjectItem(
    type = RustObjectType.ITEM_CURSED_CAULDRON,
    name = R.string.item_cursed_cauldron,
    image = R.drawable.item_cursed_cauldron
) {

}
