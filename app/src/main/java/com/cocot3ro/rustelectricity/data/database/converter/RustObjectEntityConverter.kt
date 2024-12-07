package com.cocot3ro.rustelectricity.data.database.converter

import androidx.room.TypeConverter
import com.cocot3ro.rustelectricity.data.database.model.RustObjectEntity
import com.google.gson.Gson
import javax.inject.Inject

class RustObjectEntityConverter {

    @Inject
    lateinit var gson: Gson

    @TypeConverter
    fun save(list: List<RustObjectEntity>): String {
        return gson.toJson(list)
    }

    @TypeConverter
    fun restore(json: String): List<RustObjectEntity> {
        return gson.fromJson(json, Array<RustObjectEntity>::class.java).toList()
    }

}
