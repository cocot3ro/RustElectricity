package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemChineseLanternWhite : RustObjectItem(
    type = RustObjectType.ITEM_CHINESE_LANTERN_WHITE,
    name = R.string.item_chinese_lantern_white,
    image = R.drawable.item_chinese_lantern_white
) {

}
