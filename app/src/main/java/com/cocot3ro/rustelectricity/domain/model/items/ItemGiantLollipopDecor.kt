package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGiantLollipopDecor : RustObjectItem(
    type = RustObjectType.ITEM_GIANT_LOLLIPOP_DECOR,
    name = R.string.item_giant_lollipop_decor,
    image = R.drawable.item_giant_lollipop_decor
) {

}
