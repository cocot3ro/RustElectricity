package com.cocot3ro.rustelectricity.domain.model

abstract class RustObjectItem(
    val type: RustObjectType
) {
    companion object

    val nameRes: Int = type.nameRes
    val imageRes: Int = type.imageRes

}
