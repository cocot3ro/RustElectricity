package com.cocot3ro.rustelectricity.data.database.converter

import androidx.room.TypeConverter
import com.cocot3ro.rustelectricity.data.database.model.ToolEntity
import com.google.gson.Gson
import javax.inject.Inject

class ToolEntityConverter {

    @Inject
    lateinit var gson: Gson

    @TypeConverter
    fun save(list: List<ToolEntity>): String {
        return gson.toJson(list)
    }

    @TypeConverter
    fun restore(json: String): List<ToolEntity> {
        return gson.fromJson(json, Array<ToolEntity>::class.java).toList()
    }

}
