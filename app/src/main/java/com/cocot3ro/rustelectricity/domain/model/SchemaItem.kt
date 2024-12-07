package com.cocot3ro.rustelectricity.domain.model

data class SchemaItem(
    val id: Long = 0L,
    val components: List<RustObjectItem>
)