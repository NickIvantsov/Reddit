package com.example.android.reddit.core

import android.app.Application
import com.example.android.reddit.BuildConfig
import com.example.android.reddit.di.*
import com.example.android.reddit.util.ReleaseThree
import com.facebook.stetho.Stetho
import org.koin.android.ext.android.startKoin
import timber.log.Timber

class RedditApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(
            androidContext = this,
            listOf(
                apiModule,
                networkModule,
                viewModelModule,
                repositoryModule,
                databaseModule
            )
        )
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())

            // Create an InitializerBuilder
            val initializerBuilder = Stetho.newInitializerBuilder(applicationContext)

            // Enable Chrome DevTools
            initializerBuilder.enableWebKitInspector(
                Stetho.defaultInspectorModulesProvider(applicationContext)
            )

            // Enable command line interface
            initializerBuilder.enableDumpapp(
                Stetho.defaultDumperPluginsProvider(applicationContext)
            )

            // Use the InitializerBuilder to generate an Initializer
            val initializer = initializerBuilder.build()

            // Initialize Stetho with the Initializer
            Stetho.initialize(initializer)

        } else {
            Timber.plant(ReleaseThree())
        }
    }
}