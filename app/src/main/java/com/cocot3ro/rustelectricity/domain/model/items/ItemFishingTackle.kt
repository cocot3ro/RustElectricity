package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemFishingTackle : RustObjectItem(
    type = RustObjectType.ITEM_FISHING_TACKLE,
    name = R.string.item_fishing_tackle,
    image = R.drawable.item_fishing_tackle
) {

}
