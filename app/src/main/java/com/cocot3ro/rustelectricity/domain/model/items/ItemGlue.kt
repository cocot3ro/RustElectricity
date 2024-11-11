package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGlue : RustObjectItem(
    type = RustObjectType.ITEM_GLUE,
    name = R.string.item_glue,
    image = R.drawable.item_glue
) {

}