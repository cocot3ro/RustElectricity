package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBurntChicken : RustObjectItem(
    type = RustObjectType.ITEM_BURNT_CHICKEN,
    name = R.string.item_burnt_chicken,
    image = R.drawable.item_burnt_chicken
) {

}
