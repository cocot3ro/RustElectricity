package com.cocot3ro.rustelectricity.data.database.model

data class ToolEntity(
    val id: Long,

    val type: String,

    val plugA: Long,
    val plugB: Long,

    val positions: List<Pair<Float, Float>>
)
