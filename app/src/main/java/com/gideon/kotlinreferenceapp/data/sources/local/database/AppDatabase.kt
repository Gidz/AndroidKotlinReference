package com.gideon.kotlinreferenceapp.data.sources.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gideon.kotlinreferenceapp.data.models.posts.Post
import com.gideon.kotlinreferenceapp.data.sources.local.dao.posts.PostsDao

@Database(entities = [Post::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postsDao(): PostsDao
}

