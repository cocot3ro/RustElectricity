package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemLongsleeveTShirt(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_LONGSLEEVE_T_SHIRT,
    name = R.string.item_longsleeve_t_shirt,
    image = R.drawable.item_longsleeve_t_shirt
), Researcheable {

}