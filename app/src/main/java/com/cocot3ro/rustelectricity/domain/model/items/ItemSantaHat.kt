package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSantaHat : RustObjectItem(
    type = RustObjectType.ITEM_SANTA_HAT,
    name = R.string.item_santa_hat,
    image = R.drawable.item_santa_hat
) {

}
