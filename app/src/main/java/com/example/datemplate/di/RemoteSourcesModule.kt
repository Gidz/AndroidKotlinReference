package com.example.datemplate.di

import com.example.datemplate.data.sources.base.posts.PostsRemoteDataSource
import com.example.datemplate.data.sources.remote.implementation.posts.PostsRemoteDataSourceImpl
import org.koin.dsl.module

val remoteSourcesModule = module {
    single<PostsRemoteDataSource> {
        PostsRemoteDataSourceImpl(
            postsAPI = get()
        )
    }
}