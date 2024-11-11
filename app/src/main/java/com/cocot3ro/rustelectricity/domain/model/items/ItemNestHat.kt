package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemNestHat : RustObjectItem(
    type = RustObjectType.ITEM_NEST_HAT,
    name = R.string.item_nest_hat,
    image = R.drawable.item_nest_hat
) {

}
