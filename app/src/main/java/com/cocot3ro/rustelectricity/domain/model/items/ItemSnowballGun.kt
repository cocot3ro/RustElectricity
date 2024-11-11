package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSnowballGun : RustObjectItem(
    type = RustObjectType.ITEM_SNOWBALL_GUN,
    name = R.string.item_snowball_gun,
    image = R.drawable.item_snowball_gun
) {

}
