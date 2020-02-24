package com.example.datemplate.ui

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.datemplate.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    // Lazy Inject ViewModel
    private val mainActivityViewModel: MainActivityViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        posts_list.layoutManager = LinearLayoutManager(this)
        mainActivityViewModel.postsLiveData.observe(this, Observer {
            print("Received data!!")
            posts_list.adapter = PostsAdapter(mainActivityViewModel.postsLiveData.value!!, this)
        })
    }

    override fun onStart() {
        super.onStart()
        mainActivityViewModel.downloadPosts()
    }

}
