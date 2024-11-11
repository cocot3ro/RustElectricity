package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemGasCompressionOverdrive(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_GAS_COMPRESSION_OVERDRIVE,
    name = R.string.item_gas_compression_overdrive,
    image = R.drawable.item_gas_compression_overdrive
), Researcheable {

}
