package com.cocot3ro.rustelectricity.domain.model.extension

import com.cocot3ro.rustelectricity.domain.model.RustObjectType

fun RustObjectType.toDatabase(): String {
    return this.name
}
