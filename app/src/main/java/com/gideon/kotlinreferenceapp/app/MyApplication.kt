package com.gideon.kotlinreferenceapp.app

import android.app.Application
import com.gideon.kotlinreferenceapp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // Planting timber as early as possible.
        Timber.plant(Timber.DebugTree())

        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@MyApplication)

            // declare modules
            modules(appModule)
        }
    }
}
