package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSemiAutomaticBody : RustObjectItem(
    type = RustObjectType.ITEM_SEMI_AUTOMATIC_BODY,
    name = R.string.item_semi_automatic_body,
    image = R.drawable.item_semi_automatic_body
) {

}
