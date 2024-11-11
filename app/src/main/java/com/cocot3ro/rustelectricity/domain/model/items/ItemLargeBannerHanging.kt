package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemLargeBannerHanging : RustObjectItem(
    type = RustObjectType.ITEM_LARGE_BANNER_HANGING,
    name = R.string.item_large_banner_hanging,
    image = R.drawable.item_large_banner_hanging
) {

}
