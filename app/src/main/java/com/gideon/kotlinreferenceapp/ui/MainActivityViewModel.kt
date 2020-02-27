package com.gideon.kotlinreferenceapp.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gideon.kotlinreferenceapp.data.models.core.Resource
import com.gideon.kotlinreferenceapp.data.models.posts.Post
import com.gideon.kotlinreferenceapp.domain.GetPosts
import kotlinx.coroutines.launch


class MainActivityViewModel(private val getPosts: GetPosts) : ViewModel() {

    val postsLiveData = MutableLiveData<List<Post>>()

    fun getPosts() {
        viewModelScope.launch {

            val postsResponse = getPosts.invoke()

            when (postsResponse) {
                is Resource.Success -> {
                    postsLiveData.postValue(postsResponse.data)
                }
            }

        }
    }
}
