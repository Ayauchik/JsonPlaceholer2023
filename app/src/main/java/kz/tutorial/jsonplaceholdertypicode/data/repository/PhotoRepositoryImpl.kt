package kz.tutorial.jsonplaceholdertypicode.data.repository

import kz.tutorial.jsonplaceholdertypicode.data.network.MainApi
import kz.tutorial.jsonplaceholdertypicode.domain.entity.Photo
import kz.tutorial.jsonplaceholdertypicode.domain.repository.PhotoRepository

class PhotoRepositoryImpl(private val mainApi: MainApi): PhotoRepository {
    override suspend fun getPhotos(): List<Photo> {
        return mainApi.getPhotos()
    }

    override suspend fun getPhotosFromAlbum(albumId: Long): List<Photo> {
        return mainApi.getPhotosFromAlbum(albumId)
    }

    override suspend fun getPhoto(photoId: Long): Photo {
        return mainApi.getPhotoDetails(photoId)
    }
}