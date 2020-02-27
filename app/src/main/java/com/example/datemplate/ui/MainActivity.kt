package com.example.datemplate.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.datemplate.R
import com.example.datemplate.data.models.Post
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    // Lazy Inject ViewModel
    private val mainActivityViewModel: MainActivityViewModel by viewModel()
    private lateinit var postsAdapter: PostsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Creating an adapter for the recycler view list
         */
        postsAdapter = PostsAdapter(
            this,
            object : PostsAdapter.OnPostClickListener {
                override fun onPostClick(post: Post, position: Int) {
                    Toast.makeText(
                        applicationContext,
                        "Remove " + post.title,
                        Toast.LENGTH_LONG
                    ).show()

                    // Remove the clicked item
                    postsAdapter.removeItem(position)

                }
            }
        )

        posts_list.layoutManager = LinearLayoutManager(this)
        posts_list.adapter = postsAdapter

        mainActivityViewModel.postsLiveData.observe(this, Observer {
            postsAdapter.updateData(mainActivityViewModel.postsLiveData.value!!)
        })
    }

    override fun onStart() {
        super.onStart()
        mainActivityViewModel.getPosts()
    }
}
