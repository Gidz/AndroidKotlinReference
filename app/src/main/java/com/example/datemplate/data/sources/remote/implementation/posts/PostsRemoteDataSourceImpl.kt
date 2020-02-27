package com.example.datemplate.data.sources.remote.implementation.posts

import com.example.datemplate.data.api.PostsAPI
import com.example.datemplate.data.models.posts.Post
import com.example.datemplate.data.sources.base.posts.PostsRemoteDataSource

class PostsRemoteDataSourceImpl(private val postsAPI: PostsAPI) :
    PostsRemoteDataSource {
    override suspend fun getPosts(): List<Post> {
        val response = postsAPI.getPosts()
        return response.body()!!
    }
}
