package com.gideon.kotlinreferenceapp.di

import com.gideon.kotlinreferenceapp.app.MyApplication
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = listOf(
    module {
        single {
            androidApplication() as MyApplication
        }
    },
    viewModelsModule,
    networkModule,
    localSourcesModule,
    remoteSourcesModule,
    repositoryModule,
    domainModule,
    sharedPreferencesModule,
    databaseModule,
    daoModule
)