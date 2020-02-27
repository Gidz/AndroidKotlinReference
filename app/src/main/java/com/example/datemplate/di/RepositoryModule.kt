package com.example.datemplate.di


import com.example.datemplate.data.sources.base.posts.PostsRepository
import com.example.datemplate.data.sources.repositories.posts.PostsRepositoryImpl
import org.koin.dsl.module


val repositoryModule = module {
    single<PostsRepository> {
        PostsRepositoryImpl(
            localDataSource = get(),
            remoteDataSource = get()
        )
    }
}
