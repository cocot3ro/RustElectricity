package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemButcherKnife : RustObjectItem(
    type = RustObjectType.ITEM_BUTCHER_KNIFE,
    name = R.string.item_butcher_knife,
    image = R.drawable.item_butcher_knife
) {

}
