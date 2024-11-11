package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSnowman : RustObjectItem(
    type = RustObjectType.ITEM_SNOWMAN,
    name = R.string.item_snowman,
    image = R.drawable.item_snowman
) {

}
