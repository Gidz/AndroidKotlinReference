package com.gideon.kotlinreferenceapp.di

import com.gideon.kotlinreferenceapp.app.MyApplication
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = module {
    single {
        androidApplication() as MyApplication
    }
}