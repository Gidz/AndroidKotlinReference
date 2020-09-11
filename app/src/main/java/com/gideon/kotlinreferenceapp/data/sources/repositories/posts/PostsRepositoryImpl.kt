package com.gideon.kotlinreferenceapp.data.sources.repositories.posts

import com.gideon.kotlinreferenceapp.domain.models.core.Resource
import com.gideon.kotlinreferenceapp.domain.models.posts.Post
import com.gideon.kotlinreferenceapp.data.sources.base.posts.PostsLocalDataSource
import com.gideon.kotlinreferenceapp.data.sources.base.posts.PostsRemoteDataSource
import com.gideon.kotlinreferenceapp.data.sources.base.posts.PostsRepository

class PostsRepositoryImpl(
    private val localDataSource: PostsLocalDataSource,
    private val remoteDataSource: PostsRemoteDataSource
) : PostsRepository {
    override suspend fun getPosts(): Resource<List<Post>> {

        // Check the local database first for posts and then check to the remote source.
        when (val localPostsResponse = localDataSource.getPosts()) {

            // If posts were found in the local data source.
            is Resource.Success -> {
                return localPostsResponse
            }

            // If posts weren't found in the local data source, go check the remote data source.
            is Resource.Error -> {

                val remotePostsResponse = remoteDataSource.getPosts()

                return when (remotePostsResponse) {

                    // If the remote data source sent back posts.
                    is Resource.Success -> {
                        // Save the data in the database after retrieving from the database.
                        localDataSource.savePosts(remotePostsResponse.data)

                        remotePostsResponse
                    }

                    // If remote data spurce failed to send back posts.
                    is Resource.Error -> {
                        remotePostsResponse
                    }
                }
            }
        }
    }
}
