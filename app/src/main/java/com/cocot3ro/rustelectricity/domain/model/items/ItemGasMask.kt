package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemGasMask : RustObjectItem(
    type = RustObjectType.ITEM_GAS_MASK,
    name = R.string.item_gas_mask,
    image = R.drawable.item_gas_mask
) {

}
