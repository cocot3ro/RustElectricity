package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemAdventCalendar : RustObjectItem(
    type = RustObjectType.ITEM_ADVENT_CALENDAR,
    name = R.string.item_advent_calendar,
    image = R.drawable.item_advent_calendar
) {

}
