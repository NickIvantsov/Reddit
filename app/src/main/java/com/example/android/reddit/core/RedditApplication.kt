package com.example.android.reddit.core

import android.app.Application
import com.example.android.reddit.BuildConfig
import com.example.android.reddit.di.apiModule
import com.example.android.reddit.di.networkModule
import com.example.android.reddit.di.repositoryModule
import com.example.android.reddit.di.viewModelModule
import com.example.android.reddit.util.ReleaseThree
import org.koin.android.ext.android.startKoin
import timber.log.Timber

class RedditApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(
            androidContext = this,
            listOf(apiModule, networkModule, viewModelModule, repositoryModule)
        )
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(ReleaseThree())
        }
    }
}