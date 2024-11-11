package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSurgeonScrubs : RustObjectItem(
    type = RustObjectType.ITEM_SURGEON_SCRUBS,
    name = R.string.item_surgeon_scrubs,
    image = R.drawable.item_surgeon_scrubs
) {

}
