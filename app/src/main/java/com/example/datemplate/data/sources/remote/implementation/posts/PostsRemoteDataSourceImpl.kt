package com.example.datemplate.data.sources.remote.implementation.posts

import com.example.datemplate.data.api.PostsAPI
import com.example.datemplate.data.models.core.Resource
import com.example.datemplate.data.models.posts.Post
import com.example.datemplate.data.sources.base.posts.PostsRemoteDataSource

class PostsRemoteDataSourceImpl(private val postsAPI: PostsAPI) :
    PostsRemoteDataSource {
    override suspend fun getPosts(): Resource<List<Post>> {
        val response = postsAPI.getPosts()

        return if (response.isSuccessful) {
            Resource.Success(response.body()!!)
        } else {
            Resource.Error(Throwable(response.errorBody().toString()))
        }

    }
}
