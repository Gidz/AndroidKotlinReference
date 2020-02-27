package com.gideon.kotlinreferenceapp.data.models.posts


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Post(

    @SerializedName("body")
    val body: String,

    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @SerializedName("title")
    val title: String,

    @SerializedName("userId")
    val userId: Int
)