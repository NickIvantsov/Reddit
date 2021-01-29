package com.example.android.reddit.di

import android.app.Application
import androidx.room.Room
import com.example.android.reddit.db.IRedditDao
import com.example.android.reddit.db.RedditDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module.module


val databaseModule = module {

    fun provideDatabase(application: Application): RedditDatabase {
        return Room.databaseBuilder(application, RedditDatabase::class.java, "reddit")
            .fallbackToDestructiveMigration()
            .build()
    }

    fun provideCountriesDao(database: RedditDatabase): IRedditDao {
        return database.redditDao
    }

    single { provideDatabase(androidApplication()) }
    single { provideCountriesDao(get()) }


}