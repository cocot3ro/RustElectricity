package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSofaPattern : RustObjectItem(
    type = RustObjectType.ITEM_SOFA_PATTERN,
    name = R.string.item_sofa_pattern,
    image = R.drawable.item_sofa_pattern
) {

}
