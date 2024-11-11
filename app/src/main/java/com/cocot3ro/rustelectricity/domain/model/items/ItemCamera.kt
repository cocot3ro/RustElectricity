package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCamera : RustObjectItem(
    type = RustObjectType.ITEM_CAMERA,
    name = R.string.item_camera,
    image = R.drawable.item_camera
) {

}
