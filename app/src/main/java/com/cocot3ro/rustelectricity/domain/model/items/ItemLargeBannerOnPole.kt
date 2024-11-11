package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemLargeBannerOnPole : RustObjectItem(
    type = RustObjectType.ITEM_LARGE_BANNER_ON_POLE,
    name = R.string.item_large_banner_on_pole,
    image = R.drawable.item_large_banner_on_pole
) {

}
