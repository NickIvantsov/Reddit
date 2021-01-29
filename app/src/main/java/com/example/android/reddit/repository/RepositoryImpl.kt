package com.example.android.reddit.repository

import com.example.android.catfacts.util.net.AppResult
import com.example.android.reddit.db.IRedditDao
import com.example.android.reddit.db.model.RedditTop
import com.example.android.reddit.util.net.handleSuccess
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import timber.log.Timber

class RepositoryImpl(
    private val redditApi: RedditApi,
    private val dao: IRedditDao
) : IRepository {
    override suspend fun getRedditTop(): AppResult<RedditTop> {
        val response = redditApi.getRedditTop()
        try{
            response.body()?.let {
                withContext(Dispatchers.IO) { dao.add(it) }
            }
        }catch (t:Throwable){
            Timber.e(t)
        }

        return handleSuccess(response)
    }
}