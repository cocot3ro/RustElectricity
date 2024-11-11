package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWrappingPaper : RustObjectItem(
    type = RustObjectType.ITEM_WRAPPING_PAPER,
    name = R.string.item_wrapping_paper,
    image = R.drawable.item_wrapping_paper
) {

}
