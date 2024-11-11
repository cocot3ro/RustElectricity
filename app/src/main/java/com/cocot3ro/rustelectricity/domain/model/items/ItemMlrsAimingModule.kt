package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemMlrsAimingModule : RustObjectItem(
    type = RustObjectType.ITEM_MLRS_AIMING_MODULE,
    name = R.string.item_mlrs_aiming_module,
    image = R.drawable.item_mlrs_aiming_module
) {

}
