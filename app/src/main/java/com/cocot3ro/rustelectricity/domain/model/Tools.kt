package com.cocot3ro.rustelectricity.domain.model

import androidx.compose.ui.geometry.Offset

sealed interface Tool<T : Component> {

    var plugA: T?
    var plugB: T?

    var positions: MutableList<Offset>

}

interface ElectricalTool : Tool<ElectricalComponent>

interface IndustrialTool : Tool<IndustrialComponent>

interface WaterTool : Tool<WaterComponent>
