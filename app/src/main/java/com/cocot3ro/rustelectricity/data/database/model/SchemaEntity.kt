package com.cocot3ro.rustelectricity.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.cocot3ro.rustelectricity.data.database.definition.SchemaTableDefinition.Columns.NAME
import com.cocot3ro.rustelectricity.data.database.definition.SchemaTableDefinition.Columns.PK_SCHEMA
import com.cocot3ro.rustelectricity.data.database.definition.SchemaTableDefinition.TABLE_NAME

@Entity(
    tableName = TABLE_NAME
)
data class SchemaEntity(

    @PrimaryKey
    @ColumnInfo(name = PK_SCHEMA)
    val id: Long,

    @ColumnInfo(name = NAME)
    val name: String,

    val components: List<RustObjectEntity>,

    val tools: List<ToolEntity>
)
