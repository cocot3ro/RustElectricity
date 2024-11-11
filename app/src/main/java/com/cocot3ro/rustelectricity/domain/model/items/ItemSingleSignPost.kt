package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSingleSignPost : RustObjectItem(
    type = RustObjectType.ITEM_SINGLE_SIGN_POST,
    name = R.string.item_single_sign_post,
    image = R.drawable.item_single_sign_post
) {

}