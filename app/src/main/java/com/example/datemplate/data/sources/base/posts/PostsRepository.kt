package com.example.datemplate.data.sources.base.posts

import com.example.datemplate.data.models.posts.Post

interface PostsRepository {
    suspend fun getPosts(): List<Post>
}
