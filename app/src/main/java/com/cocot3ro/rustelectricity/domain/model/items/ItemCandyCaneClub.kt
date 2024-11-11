package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCandyCaneClub : RustObjectItem(
    type = RustObjectType.ITEM_CANDY_CANE_CLUB,
    name = R.string.item_candy_cane_club,
    image = R.drawable.item_candy_cane_club
) {

}
