package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemJumpsuit : RustObjectItem(
    type = RustObjectType.ITEM_JUMPSUIT,
    name = R.string.item_jumpsuit,
    image = R.drawable.item_jumpsuit
) {

}
