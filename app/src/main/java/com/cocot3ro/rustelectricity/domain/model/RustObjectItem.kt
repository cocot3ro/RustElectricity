package com.cocot3ro.rustelectricity.domain.model

abstract class RustObjectItem(
    val type: RustObjectType
) {

    val nameRes: Int = type.nameRes
    val imageRes: Int = type.imageRes

    companion object {
        val deployables: Array<RustObjectType> = arrayOf() // FIXME: ASD
//            RustObjectTypeItem.entries.filter { item ->
//                item::class.annotations.any { it is Deployable }
//            }.toTypedArray()

        val tools: Array<RustObjectType> = arrayOf() // FIXME: ASD
//            RustObjectTypeItem.entries.filter { item ->
//                item::class.annotations.any { it is Tool<*> }
//            }.toTypedArray()
    }
}
