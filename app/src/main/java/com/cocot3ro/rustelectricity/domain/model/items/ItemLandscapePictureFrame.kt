package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemLandscapePictureFrame : RustObjectItem(
    type = RustObjectType.ITEM_LANDSCAPE_PICTURE_FRAME,
    name = R.string.item_landscape_picture_frame,
    image = R.drawable.item_landscape_picture_frame
) {

}
