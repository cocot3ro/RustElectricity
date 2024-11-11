package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemDiverPropulsionVehicle(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_DIVER_PROPULSION_VEHICLE,
    name = R.string.item_diver_propulsion_vehicle,
    image = R.drawable.item_diver_propulsion_vehicle
), Researcheable {

}