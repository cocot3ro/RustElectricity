package com.cocot3ro.rustelectricity.domain.model

import androidx.compose.ui.geometry.Offset

sealed interface ITool<T : IComponent> {

    var plugA: T?
    var plugB: T?

    var positions: MutableList<Offset>

}

interface IElectricalTool : ITool<IElectricalComponent>

interface IIndustrialTool : ITool<IIndustrialComponent>

interface IWaterTool : ITool<IWaterComponent>
