package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWideWeaponRack : RustObjectItem(
    type = RustObjectType.ITEM_WIDE_WEAPON_RACK,
    name = R.string.item_wide_weapon_rack,
    image = R.drawable.item_wide_weapon_rack
) {

}
