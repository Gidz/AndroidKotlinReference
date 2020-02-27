package com.gideon.kotlinreferenceapp.di


import com.gideon.kotlinreferenceapp.data.sources.base.posts.PostsRepository
import com.gideon.kotlinreferenceapp.data.sources.repositories.posts.PostsRepositoryImpl
import org.koin.dsl.module


val repositoryModule = module {
    single<PostsRepository> {
        PostsRepositoryImpl(
            localDataSource = get(),
            remoteDataSource = get()
        )
    }
}
