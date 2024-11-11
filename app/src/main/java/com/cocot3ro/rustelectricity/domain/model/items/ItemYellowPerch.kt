package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemYellowPerch : RustObjectItem(
    type = RustObjectType.ITEM_YELLOW_PERCH,
    name = R.string.item_yellow_perch,
    image = R.drawable.item_yellow_perch
) {

}
