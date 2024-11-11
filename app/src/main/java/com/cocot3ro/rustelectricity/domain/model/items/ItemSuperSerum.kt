package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSuperSerum : RustObjectItem(
    type = RustObjectType.ITEM_SUPER_SERUM,
    name = R.string.item_super_serum,
    image = R.drawable.item_super_serum
) {

}
