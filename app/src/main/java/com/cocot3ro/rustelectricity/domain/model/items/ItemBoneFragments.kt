package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBoneFragments : RustObjectItem(
    type = RustObjectType.ITEM_BONE_FRAGMENTS,
    name = R.string.item_bone_fragments,
    image = R.drawable.item_bone_fragments
) {

}
