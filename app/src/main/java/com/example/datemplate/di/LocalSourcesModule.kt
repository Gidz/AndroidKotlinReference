package com.example.datemplate.di

import com.example.datemplate.data.sources.base.posts.PostsLocalDataSource
import com.example.datemplate.data.sources.local.implementation.posts.PostsLocalDataSourceImpl
import org.koin.dsl.module

val localSourcesModule = module {
    single<PostsLocalDataSource> {
        PostsLocalDataSourceImpl(
            postsDao = get()
        )
    }
}