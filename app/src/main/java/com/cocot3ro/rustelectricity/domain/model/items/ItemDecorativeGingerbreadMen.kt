package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemDecorativeGingerbreadMen : RustObjectItem(
    type = RustObjectType.ITEM_DECORATIVE_GINGERBREAD_MEN,
    name = R.string.item_decorative_gingerbread_men,
    image = R.drawable.item_decorative_gingerbread_men
) {

}
