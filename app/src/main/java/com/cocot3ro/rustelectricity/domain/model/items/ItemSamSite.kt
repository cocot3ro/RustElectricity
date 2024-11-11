package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSamSite : RustObjectItem(
    type = RustObjectType.ITEM_SAM_SITE,
    name = R.string.item_sam_site,
    image = R.drawable.item_sam_site
) {

}
