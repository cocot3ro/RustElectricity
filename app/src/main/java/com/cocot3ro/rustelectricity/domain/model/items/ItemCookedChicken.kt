package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCookedChicken : RustObjectItem(
    type = RustObjectType.ITEM_COOKED_CHICKEN,
    name = R.string.item_cooked_chicken,
    image = R.drawable.item_cooked_chicken
) {

}
