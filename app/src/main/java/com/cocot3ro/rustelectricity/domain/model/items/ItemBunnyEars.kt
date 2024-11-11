package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBunnyEars : RustObjectItem(
    type = RustObjectType.ITEM_BUNNY_EARS,
    name = R.string.item_bunny_ears,
    image = R.drawable.item_bunny_ears
) {

}
