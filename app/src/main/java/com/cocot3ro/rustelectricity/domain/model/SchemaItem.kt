package com.cocot3ro.rustelectricity.domain.model

import com.cocot3ro.rustelectricity.interfaces.IDeployable

data class SchemaItem(
    val id: Long = 0L,
    val components: List<IDeployable>
)