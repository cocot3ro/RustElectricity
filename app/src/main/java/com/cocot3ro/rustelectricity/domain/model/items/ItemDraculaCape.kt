package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemDraculaCape : RustObjectItem(
    type = RustObjectType.ITEM_DRACULA_CAPE,
    name = R.string.item_dracula_cape,
    image = R.drawable.item_dracula_cape
) {

}
