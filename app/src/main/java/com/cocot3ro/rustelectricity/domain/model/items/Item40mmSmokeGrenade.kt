package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object Item40mmSmokeGrenade : RustObjectItem(
    type = RustObjectType.ITEM_40MM_SMOKE_GRENADE,
    name = R.string.item_40mm_smoke_grenade,
    image = R.drawable.item_40mm_smoke_grenade
) {

}
