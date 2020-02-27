package com.example.datemplate.data.sources.local

import com.example.datemplate.data.models.Post
import com.example.datemplate.data.sources.base.PostsLocalDataSource
import com.example.datemplate.data.sources.local.database.AppDatabase
import timber.log.Timber

class PostsLocalDataSourceImpl(private val appDatabase: AppDatabase) : PostsLocalDataSource {
    override suspend fun savePosts(posts: List<Post>) {

        for (post in posts) {
            appDatabase.postsDao().insertPost(post)
        }

        Timber.e("All posts inserted in the database.")
    }

    override suspend fun getPosts(): List<Post> {
        return listOf()
    }

}