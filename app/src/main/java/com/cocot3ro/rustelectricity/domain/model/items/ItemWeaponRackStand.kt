package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWeaponRackStand : RustObjectItem(
    type = RustObjectType.ITEM_WEAPON_RACK_STAND,
    name = R.string.item_weapon_rack_stand,
    image = R.drawable.item_weapon_rack_stand
) {

}
