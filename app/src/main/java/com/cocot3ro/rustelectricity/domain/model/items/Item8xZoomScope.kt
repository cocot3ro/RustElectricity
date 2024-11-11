package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class Item8xZoomScope(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_8X_ZOOM_SCOPE,
    name = R.string.item_8x_zoom_scope,
    image = R.drawable.item_8x_zoom_scope
), Researcheable {

}