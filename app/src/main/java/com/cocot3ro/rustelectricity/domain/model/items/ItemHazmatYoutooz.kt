package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemHazmatYoutooz : RustObjectItem(
    type = RustObjectType.ITEM_HAZMAT_YOUTOOZ,
    name = R.string.item_hazmat_youtooz,
    image = R.drawable.item_hazmat_youtooz
) {

}
