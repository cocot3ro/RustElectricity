package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemHorizontalWeaponRack : RustObjectItem(
    type = RustObjectType.ITEM_HORIZONTAL_WEAPON_RACK,
    name = R.string.item_horizontal_weapon_rack,
    image = R.drawable.item_horizontal_weapon_rack
) {

}
