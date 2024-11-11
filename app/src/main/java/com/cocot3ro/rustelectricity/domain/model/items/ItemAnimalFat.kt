package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemAnimalFat : RustObjectItem(
    type = RustObjectType.ITEM_ANIMAL_FAT,
    name = R.string.item_animal_fat,
    image = R.drawable.item_animal_fat
) {

}