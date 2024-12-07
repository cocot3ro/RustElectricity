package com.cocot3ro.rustelectricity.domain.model.extension

import com.cocot3ro.rustelectricity.data.database.model.RustObjectEntity
import com.cocot3ro.rustelectricity.domain.model.IDeployable
import com.cocot3ro.rustelectricity.domain.model.RustObjectItem

fun IDeployable.toDatabase(id: Long): RustObjectEntity {

    this as RustObjectItem

    return RustObjectEntity(
        id = id,
        type = this.type.toDatabase(),
        position = this.position.x to this.position.y
    )
}
