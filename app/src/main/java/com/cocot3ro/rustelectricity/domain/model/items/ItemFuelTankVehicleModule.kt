package com.cocot3ro.rustelectricity.domain.model.items

import com.cocot3ro.rustelectricity.R
import com.cocot3ro.rustelectricity.core.RustObjectType
import com.cocot3ro.rustelectricity.domain.model.Researcheable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

data class ItemFuelTankVehicleModule(
    override val isBlueprint: Boolean = false
) : RustObjectItem(
    type = RustObjectType.ITEM_FUEL_TANK_VEHICLE_MODULE,
    name = R.string.item_fuel_tank_vehicle_module,
    image = R.drawable.item_fuel_tank_vehicle_module
), Researcheable {

}
