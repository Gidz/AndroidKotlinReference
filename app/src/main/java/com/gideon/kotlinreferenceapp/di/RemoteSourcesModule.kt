package com.gideon.kotlinreferenceapp.di

import com.gideon.kotlinreferenceapp.data.sources.base.posts.PostsRemoteDataSource
import com.gideon.kotlinreferenceapp.data.sources.remote.implementation.posts.PostsRemoteDataSourceImpl
import org.koin.dsl.module

val remoteSourcesModule = module {
    single<PostsRemoteDataSource> {
        PostsRemoteDataSourceImpl(
            postsAPI = get()
        )
    }
}