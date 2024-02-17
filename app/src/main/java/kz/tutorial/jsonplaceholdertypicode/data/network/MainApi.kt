package kz.tutorial.jsonplaceholdertypicode.data.network

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Album
import kz.tutorial.jsonplaceholdertypicode.domain.entity.Comment
import kz.tutorial.jsonplaceholdertypicode.domain.entity.Photo
import kz.tutorial.jsonplaceholdertypicode.domain.entity.Post
import kz.tutorial.jsonplaceholdertypicode.domain.entity.User
import retrofit2.http.GET
import retrofit2.http.Path

interface MainApi {

    @GET("posts")
    suspend fun getPosts(): List<Post>

    @GET("posts/{id}")
    suspend fun getPost(@Path("id") postId: Int): Post

    @GET("posts/{id}/comments")
    suspend fun getPostComments(@Path("id") postId: Int): List<Comment>

    @GET("users/{id}")
    suspend fun getUser(@Path("id") userId: Int): User

    @GET("albums")
    suspend fun getAlbums(): List<Album>

    @GET("photos")
    suspend fun getPhotos(): List<Photo>

    @GET("photos/{id}")
    suspend fun getPhotoDetails(@Path("id") albumId: Long): Photo

    @GET("albums/{id}/photos")
    suspend fun getPhotosFromAlbum(@Path("id") albumId: Long): List<Photo>

}