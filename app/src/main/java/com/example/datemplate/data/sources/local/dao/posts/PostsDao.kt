package com.example.datemplate.data.sources.local.dao.posts

import androidx.room.*
import com.example.datemplate.data.models.posts.Post

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