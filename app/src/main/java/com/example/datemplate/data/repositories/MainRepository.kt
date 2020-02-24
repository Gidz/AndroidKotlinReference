package com.example.datemplate.data.repositories

import com.example.datemplate.data.api.MainAPI
import com.example.datemplate.data.models.Post

class MainRepository(private val mainAPI: MainAPI) {
    suspend fun getPosts(): List<Post> {
        val response =  mainAPI.getPosts()
        return response.body()!!
    }
}