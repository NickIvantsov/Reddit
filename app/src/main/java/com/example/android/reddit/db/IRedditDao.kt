package com.example.android.reddit.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.android.reddit.db.model.RedditTop
@Dao
interface IRedditDao {
    @Query("SELECT * FROM reddit")
    fun findAll(): List<RedditTop>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun add(top: RedditTop)
}