package com.example.datemplate.data.sources.local.implementation.posts

import com.example.datemplate.data.models.core.Resource
import com.example.datemplate.data.models.posts.Post
import com.example.datemplate.data.sources.base.posts.PostsLocalDataSource
import com.example.datemplate.data.sources.local.dao.posts.PostsDao
import timber.log.Timber

class PostsLocalDataSourceImpl(private val postsDao: PostsDao) : PostsLocalDataSource {
    override suspend fun savePosts(posts: List<Post>) {

        // Loop over the posts one by one and insert them into the DB.
        for (post in posts) {
            postsDao.insertPost(post)
        }

        Timber.e("All posts inserted in the database.")
    }

    override suspend fun getPosts(): Resource<List<Post>> {
        val posts = postsDao.getPosts()

        return if (posts.isEmpty()) {
            Resource.Error(Throwable("No posts Found"))
        } else {
            Resource.Success(posts)
        }
    }

}