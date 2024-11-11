package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemPortraitPictureFrame : RustObjectItem(
    type = RustObjectType.ITEM_PORTRAIT_PICTURE_FRAME,
    name = R.string.item_portrait_picture_frame,
    image = R.drawable.item_portrait_picture_frame
) {

}
