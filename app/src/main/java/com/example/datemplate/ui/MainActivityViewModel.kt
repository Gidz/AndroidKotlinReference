package com.example.datemplate.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.datemplate.data.models.Post
import com.example.datemplate.domain.GetPosts
import kotlinx.coroutines.launch


class MainActivityViewModel(private val getPosts: GetPosts) : ViewModel() {

    val postsLiveData = MutableLiveData<List<Post>>()

    fun getPosts() {
        viewModelScope.launch {
            val posts: List<Post> = getPosts.invoke()
            postsLiveData.postValue(posts)
        }
    }
}