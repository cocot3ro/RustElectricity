package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemTestGenerator : RustObjectItem(
    type = RustObjectType.ITEM_TEST_GENERATOR,
    name = R.string.item_test_generator,
    image = R.drawable.item_test_generator
) {

}
