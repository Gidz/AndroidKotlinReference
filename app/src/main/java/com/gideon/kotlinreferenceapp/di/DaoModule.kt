package com.gideon.kotlinreferenceapp.di

import com.gideon.kotlinreferenceapp.data.sources.local.database.AppDatabase
import org.koin.dsl.module

val daoModule = module {
    single {
        get<AppDatabase>().postsDao()
    }
}