package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemOneSidedTownSignPost : RustObjectItem(
    type = RustObjectType.ITEM_ONE_SIDED_TOWN_SIGN_POST,
    name = R.string.item_one_sided_town_sign_post,
    image = R.drawable.item_one_sided_town_sign_post
) {

}
