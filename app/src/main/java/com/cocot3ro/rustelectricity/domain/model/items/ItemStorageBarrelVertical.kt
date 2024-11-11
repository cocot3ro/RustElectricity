package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemStorageBarrelVertical : RustObjectItem(
    type = RustObjectType.ITEM_STORAGE_BARREL_VERTICAL,
    name = R.string.item_storage_barrel_vertical,
    image = R.drawable.item_storage_barrel_vertical
) {

}
