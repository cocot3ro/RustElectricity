package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGrub : RustObjectItem(
    type = RustObjectType.ITEM_GRUB,
    name = R.string.item_grub,
    image = R.drawable.item_grub
) {

}
