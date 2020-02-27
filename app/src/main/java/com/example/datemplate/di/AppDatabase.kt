package com.example.datemplate.di

import androidx.room.Room
import com.example.datemplate.data.sources.local.database.AppDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appDatabaseModule = module {
    single {
        Room.databaseBuilder(
            androidApplication(),
            AppDatabase::class.java,
            "appDB"
        ).build()
    }
}