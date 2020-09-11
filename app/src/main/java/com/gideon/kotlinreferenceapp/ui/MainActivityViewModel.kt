package com.gideon.kotlinreferenceapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gideon.kotlinreferenceapp.domain.models.core.Resource
import com.gideon.kotlinreferenceapp.domain.models.posts.Post
import com.gideon.kotlinreferenceapp.domain.usecases.GetPosts
import kotlinx.coroutines.launch


class MainActivityViewModel(private val getPosts: GetPosts) : ViewModel() {

    val postsLiveData = MutableLiveData<List<Post>>()

    fun getPosts() {
        viewModelScope.launch {
            when (val postsResponse = getPosts.invoke()) {
                is Resource.Success -> {
                    postsLiveData.postValue(postsResponse.data)
                }
            }

        }
    }
}
