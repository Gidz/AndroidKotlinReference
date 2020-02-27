package com.example.datemplate.data.sources.base.posts

import com.example.datemplate.data.models.core.Resource
import com.example.datemplate.data.models.posts.Post

interface PostsRepository {
    suspend fun getPosts(): Resource<List<Post>>
}
