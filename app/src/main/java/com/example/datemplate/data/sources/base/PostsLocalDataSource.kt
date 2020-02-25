package com.example.datemplate.data.sources.base

import com.example.datemplate.data.models.Post

interface PostsLocalDataSource : PostsDataSource {
    suspend fun savePosts(posts: List<Post>)
}
