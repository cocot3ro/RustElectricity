package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemTallWeaponRack : RustObjectItem(
    type = RustObjectType.ITEM_TALL_WEAPON_RACK,
    name = R.string.item_tall_weapon_rack,
    image = R.drawable.item_tall_weapon_rack
) {

}
