package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data object ItemResearchPaper : RustObjectItem(
    type = RustObjectType.ITEM_RESEARCH_PAPER,
    name = R.string.item_research_paper,
    image = R.drawable.item_research_paper
) {

}
