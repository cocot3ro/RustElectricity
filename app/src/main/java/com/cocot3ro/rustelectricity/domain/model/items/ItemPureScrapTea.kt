package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPureScrapTea : RustObjectItem(
    type = RustObjectType.ITEM_PURE_SCRAP_TEA,
    name = R.string.item_pure_scrap_tea,
    image = R.drawable.item_pure_scrap_tea
) {

}
