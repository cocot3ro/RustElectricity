package com.cocot3ro.rustelectricity.data.database.model

data class RustObjectEntity(

    val id: Long,

    val type: String,

    val position: Pair<Float, Float>,

    val metadata: Map<String, Metadata>? = null
)
