package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemFrogBoots : RustObjectItem(
    type = RustObjectType.ITEM_FROG_BOOTS,
    name = R.string.item_frog_boots,
    image = R.drawable.item_frog_boots
) {

}
