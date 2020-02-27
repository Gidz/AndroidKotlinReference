package com.example.datemplate.domain

import com.example.datemplate.data.models.core.Resource
import com.example.datemplate.data.models.posts.Post
import com.example.datemplate.data.sources.base.posts.PostsRepository

class GetPosts(private val postsRepository: PostsRepository) {
    suspend fun invoke(): Resource<List<Post>> {
        return postsRepository.getPosts()
    }
}