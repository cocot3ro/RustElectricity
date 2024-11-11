package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemM39Rifle : RustObjectItem(
    type = RustObjectType.ITEM_M39_RIFLE,
    name = R.string.item_m39_rifle,
    image = R.drawable.item_m39_rifle
) {

}
