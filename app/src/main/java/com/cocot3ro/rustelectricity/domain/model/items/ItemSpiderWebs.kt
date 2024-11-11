package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSpiderWebs : RustObjectItem(
    type = RustObjectType.ITEM_SPIDER_WEBS,
    name = R.string.item_spider_webs,
    image = R.drawable.item_spider_webs
) {

}
