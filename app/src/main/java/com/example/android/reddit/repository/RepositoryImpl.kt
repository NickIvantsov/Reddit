package com.example.android.reddit.repository

import com.example.android.catfacts.util.net.AppResult
import com.example.android.reddit.db.model.RedditTop
import com.example.android.reddit.util.net.handleSuccess

class RepositoryImpl(
    private val redditApi: RedditApi,
) : IRepository {
    override suspend fun getRedditTop(): AppResult<RedditTop> {
        val response = redditApi.getRedditTop()
        return handleSuccess(response)
    }
}