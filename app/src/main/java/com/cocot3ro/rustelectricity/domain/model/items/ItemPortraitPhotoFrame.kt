package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemPortraitPhotoFrame(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_PORTRAIT_PHOTO_FRAME,
    name = R.string.item_portrait_photo_frame,
    image = R.drawable.item_portrait_photo_frame
), Researcheable {

}