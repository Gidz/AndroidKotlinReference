package com.example.datemplate.di

import com.example.app.MyApplication
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = module {
    single {
        androidApplication() as MyApplication
    }
}