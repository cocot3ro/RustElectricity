package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemDecorativePinecones : RustObjectItem(
    type = RustObjectType.ITEM_DECORATIVE_PINECONES,
    name = R.string.item_decorative_pinecones,
    image = R.drawable.item_decorative_pinecones
) {

}
