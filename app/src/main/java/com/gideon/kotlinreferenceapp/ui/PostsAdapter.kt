package com.gideon.kotlinreferenceapp.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gideon.kotlinreferenceapp.R
import com.gideon.kotlinreferenceapp.data.models.posts.Post
import kotlinx.android.synthetic.main.posts_list_item.view.*


class PostsAdapter(
    private val context: Context,
    private val postsClickListener: OnPostClickListener
) : RecyclerView.Adapter<ViewHolder>() {

    // Saving data as a mutable list allows addition and removals easy from the list.
    var posts: MutableList<Post> = ArrayList<Post>()

    fun updateData(posts: List<Post>) {
        this.posts = posts.toMutableList()
        notifyDataSetChanged()
    }

    fun removeItem(position: Int) {
        this.posts.removeAt(position)
        notifyDataSetChanged()
    }

    fun addItem(post: Post, position: Int) {
        this.posts.add(position, post)
        notifyDataSetChanged()
    }

    fun updateItem(post: Post, position: Int) {
        this.posts[position] = post
        notifyDataSetChanged()
    }


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
        holder.itemView.setOnClickListener {
            postsClickListener.onPostClick(posts[position], position)
        }
    }

    interface OnPostClickListener {
        fun onPostClick(post: Post, position: Int)
    }
}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val postTitle = view.post_list_item_title
    val postBody = view.post_list_item_body
}