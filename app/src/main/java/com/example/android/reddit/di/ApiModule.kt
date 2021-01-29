package com.example.android.reddit.di

import com.example.android.reddit.repository.RedditApi
import org.koin.dsl.module.module
import retrofit2.Retrofit

val apiModule = module {

    fun provideCountriesApi(retrofit: Retrofit): RedditApi {
        return retrofit.create(RedditApi::class.java)
    }
    single { provideCountriesApi(get()) }

}