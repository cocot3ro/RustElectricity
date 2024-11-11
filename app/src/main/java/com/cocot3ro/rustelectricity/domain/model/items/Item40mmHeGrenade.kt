package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object Item40mmHeGrenade : RustObjectItem(
    type = RustObjectType.ITEM_40MM_HE_GRENADE,
    name = R.string.item_40mm_he_grenade,
    image = R.drawable.item_40mm_he_grenade
) {

}
