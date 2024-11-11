package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemL96Rifle : RustObjectItem(
    type = RustObjectType.ITEM_L96_RIFLE,
    name = R.string.item_l96_rifle,
    image = R.drawable.item_l96_rifle
) {

}
