package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWrappedGift : RustObjectItem(
    type = RustObjectType.ITEM_WRAPPED_GIFT,
    name = R.string.item_wrapped_gift,
    image = R.drawable.item_wrapped_gift
) {

}
