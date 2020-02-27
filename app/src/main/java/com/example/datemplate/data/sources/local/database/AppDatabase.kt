package com.example.datemplate.data.sources.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.datemplate.data.models.Post
import com.example.datemplate.data.sources.local.daos.PostsDao

@Database(entities = [Post::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postsDao(): PostsDao
}

