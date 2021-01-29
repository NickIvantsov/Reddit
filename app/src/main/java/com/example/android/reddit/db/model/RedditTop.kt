package com.example.android.reddit.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.example.android.reddit.db.converters.Converters

@Entity(tableName = "reddit")
data class RedditTop(
    @TypeConverters(Converters::class)
    val `data`: Data = Data(),
    val kind: String = "",
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)