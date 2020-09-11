package com.gideon.kotlinreferenceapp.data.api

import com.gideon.kotlinreferenceapp.domain.models.posts.Post
import retrofit2.Response
import retrofit2.http.GET

interface PostsAPI {
    @GET("posts/")
    suspend fun getPosts(): Response<List<Post>>
}