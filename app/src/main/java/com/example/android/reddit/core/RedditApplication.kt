package com.example.android.reddit.core

import android.app.Application
import com.example.android.reddit.di.apiModule
import com.example.android.reddit.di.networkModule
import org.koin.android.ext.android.startKoin

class RedditApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(androidContext = this, listOf(apiModule, networkModule))
    }
}