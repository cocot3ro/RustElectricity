package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSantaBeard : RustObjectItem(
    type = RustObjectType.ITEM_SANTA_BEARD,
    name = R.string.item_santa_beard,
    image = R.drawable.item_santa_beard
) {

}
