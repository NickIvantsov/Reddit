package com.example.android.reddit.repository

import com.example.android.reddit.db.model.RedditTop
import retrofit2.Response
import retrofit2.http.GET

interface RedditApi {
    @GET("/top.json")
    suspend fun getRedditTop(): Response<RedditTop>
}