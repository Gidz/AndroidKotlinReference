package com.example.datemplate.data.sources.repositories.posts

import com.example.datemplate.data.models.posts.Post
import com.example.datemplate.data.sources.base.posts.PostsLocalDataSource
import com.example.datemplate.data.sources.base.posts.PostsRemoteDataSource
import com.example.datemplate.data.sources.base.posts.PostsRepository

class PostsRepositoryImpl(
    private val localDataSource: PostsLocalDataSource,
    private val remoteDataSource: PostsRemoteDataSource
) : PostsRepository {
    override suspend fun getPosts(): List<Post> {

        // Check the local database first for posts and then check to the remote source.
        var posts = localDataSource.getPosts()

        if(posts == null) {
            posts = remoteDataSource.getPosts()

            // Save the data in the database after retrieving from the database.
            localDataSource.savePosts(posts)
        }

        return posts
    }
}
