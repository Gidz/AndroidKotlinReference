package com.gideon.kotlinreferenceapp.di

import android.content.SharedPreferences
import com.gideon.kotlinreferenceapp.app.MyApplication
import org.koin.dsl.module

val sharedPreferencesModule = module {
    single {
        getSharedPrefs(get())
    }
}

fun getSharedPrefs(androidApplication: MyApplication): SharedPreferences {
    return androidApplication.getSharedPreferences("default", android.content.Context.MODE_PRIVATE)
}