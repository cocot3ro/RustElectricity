package com.cocot3ro.rustelectricity.data.database.definition

object SchemaTableDefinition {
    const val TABLE_NAME = "tbl_schema"

    object Columns {
        const val PK_SCHEMA = "${TABLE_NAME}__pk_schema"
        const val NAME = "${TABLE_NAME}__name"
    }
}