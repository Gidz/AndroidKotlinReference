package com.example.app

import android.app.Application
import com.example.datemplate.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // start Koin!
        startKoin {
            // declare used Android context
            androidContext(this@MyApplication)

            // declare modules
            modules(
                appModule,
                viewModelsModule,
                networkModule,
                repositoryModule,
                sharedPreferencesModule
            )
        }
    }
}
