package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSpas12Shotgun : RustObjectItem(
    type = RustObjectType.ITEM_SPAS_12_SHOTGUN,
    name = R.string.item_spas_12_shotgun,
    image = R.drawable.item_spas_12_shotgun
) {

}
