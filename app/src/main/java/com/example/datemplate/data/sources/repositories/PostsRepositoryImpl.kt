package com.example.datemplate.data.sources.repositories

import com.example.datemplate.data.models.Post
import com.example.datemplate.data.sources.base.PostsLocalDataSource
import com.example.datemplate.data.sources.base.PostsRemoteDataSource
import com.example.datemplate.data.sources.base.PostsRepository

class PostsRepositoryImpl(
    private val localDataSource: PostsLocalDataSource,
    private val remoteDataSource: PostsRemoteDataSource
) : PostsRepository {
    override suspend fun getPosts(): List<Post> {
        val posts = remoteDataSource.getPosts()
        localDataSource.savePosts(posts)
        return posts
    }
}
