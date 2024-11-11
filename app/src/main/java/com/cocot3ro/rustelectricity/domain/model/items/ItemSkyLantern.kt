package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSkyLantern : RustObjectItem(
    type = RustObjectType.ITEM_SKY_LANTERN,
    name = R.string.item_sky_lantern,
    image = R.drawable.item_sky_lantern
) {

}
