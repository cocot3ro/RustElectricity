package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemDecorativeBaubels : RustObjectItem(
    type = RustObjectType.ITEM_DECORATIVE_BAUBELS,
    name = R.string.item_decorative_baubels,
    image = R.drawable.item_decorative_baubels
) {

}
