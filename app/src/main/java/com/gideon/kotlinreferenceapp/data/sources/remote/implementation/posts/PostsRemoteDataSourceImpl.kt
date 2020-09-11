package com.gideon.kotlinreferenceapp.data.sources.remote.implementation.posts

import com.gideon.kotlinreferenceapp.data.api.PostsAPI
import com.gideon.kotlinreferenceapp.domain.models.core.Resource
import com.gideon.kotlinreferenceapp.domain.models.posts.Post
import com.gideon.kotlinreferenceapp.data.sources.base.posts.PostsRemoteDataSource

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
