package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSnowball : RustObjectItem(
    type = RustObjectType.ITEM_SNOWBALL,
    name = R.string.item_snowball,
    image = R.drawable.item_snowball
) {

}
