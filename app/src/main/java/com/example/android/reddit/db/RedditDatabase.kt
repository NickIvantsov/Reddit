package com.example.android.reddit.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.android.reddit.db.converters.Converters
import com.example.android.reddit.db.model.RedditTop

@Database(
    entities = [RedditTop::class],
    version = 1, exportSchema = false
)
@TypeConverters(Converters::class)
abstract class RedditDatabase : RoomDatabase() {
    abstract val redditDao: IRedditDao
}