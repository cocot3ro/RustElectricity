package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBurntPork : RustObjectItem(
    type = RustObjectType.ITEM_BURNT_PORK,
    name = R.string.item_burnt_pork,
    image = R.drawable.item_burnt_pork
) {

}
