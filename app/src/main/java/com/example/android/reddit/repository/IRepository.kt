package com.example.android.reddit.repository

import com.example.android.catfacts.util.net.AppResult
import com.example.android.reddit.db.model.RedditTop

interface IRepository {
    suspend fun getRedditTop(): AppResult<RedditTop>
}