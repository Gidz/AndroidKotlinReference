package com.gideon.kotlinreferenceapp.di

import androidx.room.Room
import com.gideon.kotlinreferenceapp.data.sources.local.database.AppDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val databaseModule = module {
    single<AppDatabase> {
        Room.databaseBuilder(
            androidApplication(),
            AppDatabase::class.java,
            "appDB"
        ).build()
    }
}