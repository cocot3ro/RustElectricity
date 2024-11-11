package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSkinningKnife : RustObjectItem(
    type = RustObjectType.ITEM_SKINNING_KNIFE,
    name = R.string.item_skinning_knife,
    image = R.drawable.item_skinning_knife
) {

}
