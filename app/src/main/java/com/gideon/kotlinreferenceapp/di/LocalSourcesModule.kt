package com.gideon.kotlinreferenceapp.di

import com.gideon.kotlinreferenceapp.data.sources.base.posts.PostsLocalDataSource
import com.gideon.kotlinreferenceapp.data.sources.local.implementation.posts.PostsLocalDataSourceImpl
import org.koin.dsl.module

val localSourcesModule = module {
    single<PostsLocalDataSource> {
        PostsLocalDataSourceImpl(
            postsDao = get()
        )
    }
}