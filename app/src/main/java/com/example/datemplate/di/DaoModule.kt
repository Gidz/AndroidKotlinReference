package com.example.datemplate.di

import com.example.datemplate.data.sources.local.database.AppDatabase
import org.koin.dsl.module

val daoModule = module {
    single {
        get<AppDatabase>().postsDao()
    }
}