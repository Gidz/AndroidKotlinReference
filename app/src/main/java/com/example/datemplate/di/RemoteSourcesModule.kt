package com.example.datemplate.di

import com.example.datemplate.data.sources.base.PostsRemoteDataSource
import com.example.datemplate.data.sources.remote.PostsRemoteDataSourceImpl
import org.koin.dsl.module

var remoteSourcesModule = module {
    single<PostsRemoteDataSource> {
        PostsRemoteDataSourceImpl(postsAPI = get())
    }
}