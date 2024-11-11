package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCableTunnel : RustObjectItem(
    type = RustObjectType.ITEM_CABLE_TUNNEL,
    name = R.string.item_cable_tunnel,
    image = R.drawable.item_cable_tunnel
) {

}
