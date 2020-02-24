package com.example.datemplate.di

import com.example.app.MyApplication
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

var appModule = module {
    single {
        androidApplication() as MyApplication
    }
}