package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemDuctTape : RustObjectItem(
    type = RustObjectType.ITEM_DUCT_TAPE,
    name = R.string.item_duct_tape,
    image = R.drawable.item_duct_tape
) {

}
