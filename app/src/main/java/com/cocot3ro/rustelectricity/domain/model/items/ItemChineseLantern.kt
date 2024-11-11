package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemChineseLantern : RustObjectItem(
    type = RustObjectType.ITEM_CHINESE_LANTERN,
    name = R.string.item_chinese_lantern,
    image = R.drawable.item_chinese_lantern
) {

}
