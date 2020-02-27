package com.gideon.kotlinreferenceapp.data.sources.base.posts

import com.gideon.kotlinreferenceapp.data.models.posts.Post

interface PostsLocalDataSource : PostsDataSource {
    suspend fun savePosts(posts: List<Post>)
}
