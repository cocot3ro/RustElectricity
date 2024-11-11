package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBanditGuardGear : RustObjectItem(
    type = RustObjectType.ITEM_BANDIT_GUARD_GEAR,
    name = R.string.item_bandit_guard_gear,
    image = R.drawable.item_bandit_guard_gear
) {

}
