package com.example.android.reddit.di

import com.example.android.reddit.repository.RedditApi
import com.example.android.reddit.repository.RepositoryImpl
import org.koin.dsl.module.module

val repositoryModule = module {

    fun provideCountryRepository(api: RedditApi): RepositoryImpl {
        return RepositoryImpl(api,get())
    }
    single { provideCountryRepository(get()) }

}