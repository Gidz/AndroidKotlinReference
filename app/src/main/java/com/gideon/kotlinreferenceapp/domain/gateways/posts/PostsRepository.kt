package com.gideon.kotlinreferenceapp.domain.gateways.posts

import com.gideon.kotlinreferenceapp.domain.models.core.Resource
import com.gideon.kotlinreferenceapp.domain.models.posts.Post

interface PostsRepository {
    suspend fun getPosts(): Resource<List<Post>>
}
