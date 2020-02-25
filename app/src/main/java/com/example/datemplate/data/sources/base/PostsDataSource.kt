package com.example.datemplate.data.sources.base

import com.example.datemplate.data.models.Post

interface PostsDataSource {
    suspend fun getPosts(): List<Post>
}
