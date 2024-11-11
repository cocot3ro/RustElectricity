package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemMediumFrankensteinHead : RustObjectItem(
    type = RustObjectType.ITEM_MEDIUM_FRANKENSTEIN_HEAD,
    name = R.string.item_medium_frankenstein_head,
    image = R.drawable.item_medium_frankenstein_head
) {

}
