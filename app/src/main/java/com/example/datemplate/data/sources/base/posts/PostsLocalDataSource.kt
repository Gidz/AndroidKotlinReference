package com.example.datemplate.data.sources.base.posts

import com.example.datemplate.data.models.posts.Post

interface PostsLocalDataSource : PostsDataSource {
    suspend fun savePosts(posts: List<Post>)
}
