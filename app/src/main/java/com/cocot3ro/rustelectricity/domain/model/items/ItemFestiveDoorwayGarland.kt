package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemFestiveDoorwayGarland : RustObjectItem(
    type = RustObjectType.ITEM_FESTIVE_DOORWAY_GARLAND,
    name = R.string.item_festive_doorway_garland,
    image = R.drawable.item_festive_doorway_garland
) {

}
