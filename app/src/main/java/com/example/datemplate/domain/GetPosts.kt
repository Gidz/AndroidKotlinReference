package com.example.datemplate.domain

import com.example.datemplate.data.models.Post
import com.example.datemplate.data.sources.base.PostsRepository

class GetPosts(private val postsRepository: PostsRepository) {
    suspend fun invoke(): List<Post> {
        return postsRepository.getPosts()
    }
}