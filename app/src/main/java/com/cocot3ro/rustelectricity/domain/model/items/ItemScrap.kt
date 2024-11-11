package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemScrap : RustObjectItem(
    type = RustObjectType.ITEM_SCRAP,
    name = R.string.item_scrap,
    image = R.drawable.item_scrap
) {

}
