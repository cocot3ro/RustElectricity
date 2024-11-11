package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemBirthdayCake : RustObjectItem(
    type = RustObjectType.ITEM_BIRTHDAY_CAKE,
    name = R.string.item_birthday_cake,
    image = R.drawable.item_birthday_cake
) {

}
