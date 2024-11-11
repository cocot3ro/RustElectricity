package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemRifleBody : RustObjectItem(
    type = RustObjectType.ITEM_RIFLE_BODY,
    name = R.string.item_rifle_body,
    image = R.drawable.item_rifle_body
) {

}
