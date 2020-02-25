package com.example.datemplate.data.api

import com.example.datemplate.data.models.Post
import retrofit2.Response
import retrofit2.http.GET

interface PostsAPI {
    @GET("posts/")
    suspend fun getPosts(): Response<List<Post>>
}