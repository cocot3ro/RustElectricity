package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBoonieHat : RustObjectItem(
    type = RustObjectType.ITEM_BOONIE_HAT,
    name = R.string.item_boonie_hat,
    image = R.drawable.item_boonie_hat
) {

}
