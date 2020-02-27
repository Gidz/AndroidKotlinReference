package com.example.datemplate.di

import com.example.datemplate.data.sources.base.PostsLocalDataSource
import com.example.datemplate.data.sources.local.PostsLocalDataSourceImpl
import org.koin.dsl.module

val localSourcesModule = module {
    single<PostsLocalDataSource> {
        PostsLocalDataSourceImpl(postsDao = get())
    }
}