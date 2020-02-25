package com.example.datemplate.data.sources.repositories

import com.example.datemplate.data.models.Post
import com.example.datemplate.data.sources.base.PostsRemoteDataSource
import com.example.datemplate.data.sources.base.PostsRepository

class PostsRepositoryImpl(private val remoteDataSource: PostsRemoteDataSource) : PostsRepository {
    override suspend fun getPosts(): List<Post> {
        return remoteDataSource.getPosts()
    }
}
