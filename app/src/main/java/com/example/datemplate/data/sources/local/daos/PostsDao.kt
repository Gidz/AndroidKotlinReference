package com.example.datemplate.data.sources.local.daos

import androidx.room.*
import com.example.datemplate.data.models.Post

@Dao
interface PostsDao {
    @Query("SELECT * FROM Post")
    suspend fun getPosts(): List<Post>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPost(post: Post)

    @Update
    suspend fun updatePost(post: Post)

    @Delete
    suspend fun deletePost(post: Post)
}