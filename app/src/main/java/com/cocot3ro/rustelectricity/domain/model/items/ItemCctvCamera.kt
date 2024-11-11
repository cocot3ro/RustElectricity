package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemCctvCamera : RustObjectItem(
    type = RustObjectType.ITEM_CCTV_CAMERA,
    name = R.string.item_cctv_camera,
    image = R.drawable.item_cctv_camera
) {

}
