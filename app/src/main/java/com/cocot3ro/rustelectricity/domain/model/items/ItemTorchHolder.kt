package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemTorchHolder : RustObjectItem(
    type = RustObjectType.ITEM_TORCH_HOLDER,
    name = R.string.item_torch_holder,
    image = R.drawable.item_torch_holder
) {

}
