package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBunnyHat : RustObjectItem(
    type = RustObjectType.ITEM_BUNNY_HAT,
    name = R.string.item_bunny_hat,
    image = R.drawable.item_bunny_hat
) {

}
