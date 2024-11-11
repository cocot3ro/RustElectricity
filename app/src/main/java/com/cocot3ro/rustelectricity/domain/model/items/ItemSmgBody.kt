package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemSmgBody : RustObjectItem(
    type = RustObjectType.ITEM_SMG_BODY,
    name = R.string.item_smg_body,
    image = R.drawable.item_smg_body
) {

}
