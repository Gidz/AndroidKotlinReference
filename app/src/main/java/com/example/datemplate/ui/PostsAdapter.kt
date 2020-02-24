package com.example.datemplate.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.datemplate.R
import com.example.datemplate.data.models.Post
import kotlinx.android.synthetic.main.posts_list_item.view.*


class PostsAdapter(val posts: List<Post>, val context: Context) :
    RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.posts_list_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return posts.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.postTitle.text = posts[position].title
        holder.postBody.text = posts[position].body
    }

}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val postTitle = view.post_list_item_title
    val postBody = view.post_list_item_body
}