package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemFirecrackerString : RustObjectItem(
    type = RustObjectType.ITEM_FIRECRACKER_STRING,
    name = R.string.item_firecracker_string,
    image = R.drawable.item_firecracker_string
) {

}
