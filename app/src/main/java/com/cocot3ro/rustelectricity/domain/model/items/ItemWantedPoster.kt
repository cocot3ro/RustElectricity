package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemWantedPoster : RustObjectItem(
    type = RustObjectType.ITEM_WANTED_POSTER,
    name = R.string.item_wanted_poster,
    image = R.drawable.item_wanted_poster
) {

}
