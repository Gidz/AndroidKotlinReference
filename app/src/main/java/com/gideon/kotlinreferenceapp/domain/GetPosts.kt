package com.gideon.kotlinreferenceapp.domain

import com.gideon.kotlinreferenceapp.data.models.core.Resource
import com.gideon.kotlinreferenceapp.data.models.posts.Post
import com.gideon.kotlinreferenceapp.data.sources.base.posts.PostsRepository

class GetPosts(private val postsRepository: PostsRepository) {
    suspend fun invoke(): Resource<List<Post>> {
        return postsRepository.getPosts()
    }
}