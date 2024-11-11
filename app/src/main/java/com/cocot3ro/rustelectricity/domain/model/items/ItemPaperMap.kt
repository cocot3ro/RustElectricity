package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPaperMap : RustObjectItem(
    type = RustObjectType.ITEM_PAPER_MAP,
    name = R.string.item_paper_map,
    image = R.drawable.item_paper_map
) {

}