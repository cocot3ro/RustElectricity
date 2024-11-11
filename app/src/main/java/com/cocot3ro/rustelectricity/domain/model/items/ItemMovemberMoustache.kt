package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemMovemberMoustache : RustObjectItem(
    type = RustObjectType.ITEM_MOVEMBER_MOUSTACHE,
    name = R.string.item_movember_moustache,
    image = R.drawable.item_movember_moustache
) {

}
