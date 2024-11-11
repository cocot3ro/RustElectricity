package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGranolaBar : RustObjectItem(
    type = RustObjectType.ITEM_GRANOLA_BAR,
    name = R.string.item_granola_bar,
    image = R.drawable.item_granola_bar
) {

}
