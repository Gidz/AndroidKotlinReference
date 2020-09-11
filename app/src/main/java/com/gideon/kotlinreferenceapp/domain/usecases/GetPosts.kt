package com.gideon.kotlinreferenceapp.domain.usecases

import com.gideon.kotlinreferenceapp.domain.models.core.Resource
import com.gideon.kotlinreferenceapp.domain.models.posts.Post
import com.gideon.kotlinreferenceapp.data.sources.base.posts.PostsRepository

class GetPosts(private val postsRepository: PostsRepository) {
    suspend fun invoke(): Resource<List<Post>> {
        return postsRepository.getPosts()
    }
}