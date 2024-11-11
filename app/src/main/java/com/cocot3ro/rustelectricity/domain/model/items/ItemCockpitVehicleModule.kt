package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemCockpitVehicleModule(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_COCKPIT_VEHICLE_MODULE,
    name = R.string.item_cockpit_vehicle_module,
    image = R.drawable.item_cockpit_vehicle_module
), Researcheable {

}
