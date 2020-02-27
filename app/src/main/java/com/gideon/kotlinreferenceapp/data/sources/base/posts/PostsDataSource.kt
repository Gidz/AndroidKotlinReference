package com.gideon.kotlinreferenceapp.data.sources.base.posts

import com.gideon.kotlinreferenceapp.data.models.core.Resource
import com.gideon.kotlinreferenceapp.data.models.posts.Post

interface PostsDataSource {
    suspend fun getPosts(): Resource<List<Post>>
}