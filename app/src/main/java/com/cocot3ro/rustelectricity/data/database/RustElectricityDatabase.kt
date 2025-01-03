package com.cocot3ro.rustelectricity.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.cocot3ro.rustelectricity.data.database.converter.RustObjectEntityConverter
import com.cocot3ro.rustelectricity.data.database.converter.ToolEntityConverter
import com.cocot3ro.rustelectricity.data.database.model.SchemaEntity

@Database(
    entities = [
        SchemaEntity::class
    ],
    version = 1,
    exportSchema = false
)
@TypeConverters(
    value = [
        ToolEntityConverter::class,
        RustObjectEntityConverter::class
    ]
)
abstract class RustElectricityDatabase : RoomDatabase()