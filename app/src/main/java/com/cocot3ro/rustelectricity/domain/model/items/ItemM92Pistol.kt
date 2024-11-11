package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemM92Pistol : RustObjectItem(
    type = RustObjectType.ITEM_M92_PISTOL,
    name = R.string.item_m92_pistol,
    image = R.drawable.item_m92_pistol
) {

}
