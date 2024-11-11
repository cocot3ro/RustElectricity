package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPookieBear : RustObjectItem(
    type = RustObjectType.ITEM_POOKIE_BEAR,
    name = R.string.item_pookie_bear,
    image = R.drawable.item_pookie_bear
) {

}
