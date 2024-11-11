package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemLr300AssaultRifle : RustObjectItem(
    type = RustObjectType.ITEM_LR_300_ASSAULT_RIFLE,
    name = R.string.item_lr_300_assault_rifle,
    image = R.drawable.item_lr_300_assault_rifle
) {

}
