package com.example.datemplate.data.sources.remote

import com.example.datemplate.data.api.PostsAPI
import com.example.datemplate.data.models.Post
import com.example.datemplate.data.sources.base.PostsRemoteDataSource

class PostsRemoteDataSourceImpl(private val postsAPI: PostsAPI) : PostsRemoteDataSource {
    override suspend fun getPosts(): List<Post> {
        val response = postsAPI.getPosts()
        return response.body()!!
    }
}
