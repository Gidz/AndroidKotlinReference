package com.example.datemplate.di


import com.example.datemplate.data.sources.base.PostsRepository
import com.example.datemplate.data.sources.repositories.PostsRepositoryImpl
import org.koin.dsl.module


val repositoryModule = module {
    single<PostsRepository> {
        PostsRepositoryImpl(
            localDataSource = get(),
            remoteDataSource = get()
        )
    }
}
