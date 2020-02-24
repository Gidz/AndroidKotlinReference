package com.example.datemplate.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.datemplate.data.repositories.MainRepository
import com.example.datemplate.data.models.Post
import kotlinx.coroutines.launch


class MainActivityViewModel(private val mainRepository: MainRepository) : ViewModel() {

    val postsLiveData = MutableLiveData<List<Post>>()

    fun downloadPosts() {
        viewModelScope.launch {
            val posts: List<Post> = mainRepository.getPosts()
            postsLiveData.postValue(posts)
        }
    }
}