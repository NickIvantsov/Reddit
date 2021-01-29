package com.example.android.reddit.db.converters

import androidx.room.TypeConverter
import com.example.android.reddit.db.model.Data
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class Converters {

    @TypeConverter
    fun fromString(value: String): Data {
        val dataType = object : TypeToken<Data>() {}.type
        return Gson().fromJson(value, dataType)
    }

    @TypeConverter
    fun fromDataToString(data: Data): String {
        val gson = Gson()
        return gson.toJson(data)
    }


}