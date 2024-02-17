package kz.tutorial.jsonplaceholdertypicode.domain.repository

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Photo

interface PhotoRepository {
    suspend fun getPhotos(): List<Photo>
    suspend fun getPhotosFromAlbum(albumId: Long): List<Photo>
    suspend fun getPhoto(photoId: Long): Photo
}