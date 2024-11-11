package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSheetMetal : RustObjectItem(
    type = RustObjectType.ITEM_SHEET_METAL,
    name = R.string.item_sheet_metal,
    image = R.drawable.item_sheet_metal
) {

}
