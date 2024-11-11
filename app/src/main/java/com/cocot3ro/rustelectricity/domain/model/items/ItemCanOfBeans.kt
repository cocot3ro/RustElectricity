package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCanOfBeans : RustObjectItem(
    type = RustObjectType.ITEM_CAN_OF_BEANS,
    name = R.string.item_can_of_beans,
    image = R.drawable.item_can_of_beans
) {

}
