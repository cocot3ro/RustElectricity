package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemDecorativeTinsel : RustObjectItem(
    type = RustObjectType.ITEM_DECORATIVE_TINSEL,
    name = R.string.item_decorative_tinsel,
    image = R.drawable.item_decorative_tinsel
) {

}
