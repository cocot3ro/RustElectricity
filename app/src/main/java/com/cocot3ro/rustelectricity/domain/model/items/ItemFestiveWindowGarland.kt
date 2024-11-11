package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemFestiveWindowGarland : RustObjectItem(
    type = RustObjectType.ITEM_FESTIVE_WINDOW_GARLAND,
    name = R.string.item_festive_window_garland,
    image = R.drawable.item_festive_window_garland
) {

}
