package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemMediumQualitySparkPlugs(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_MEDIUM_QUALITY_SPARK_PLUGS,
    name = R.string.item_medium_quality_spark_plugs,
    image = R.drawable.item_medium_quality_spark_plugs
), Researcheable {

}