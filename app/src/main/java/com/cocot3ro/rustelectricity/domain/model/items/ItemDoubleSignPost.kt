package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemDoubleSignPost : RustObjectItem(
    type = RustObjectType.ITEM_DOUBLE_SIGN_POST,
    name = R.string.item_double_sign_post,
    image = R.drawable.item_double_sign_post
) {

}
