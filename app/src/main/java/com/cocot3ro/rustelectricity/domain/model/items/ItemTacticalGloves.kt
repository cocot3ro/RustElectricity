package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemTacticalGloves : RustObjectItem(
    type = RustObjectType.ITEM_TACTICAL_GLOVES,
    name = R.string.item_tactical_gloves,
    image = R.drawable.item_tactical_gloves
) {

}
