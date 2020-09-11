package com.gideon.kotlinreferenceapp.data.sources.base.posts

import com.gideon.kotlinreferenceapp.domain.models.posts.Post

interface PostsLocalDataSource : PostsDataSource {
    suspend fun savePosts(posts: List<Post>)
}
