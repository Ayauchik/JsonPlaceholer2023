package kz.tutorial.jsonplaceholdertypicode.data.use_case

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Photo
import kz.tutorial.jsonplaceholdertypicode.domain.repository.PhotoRepository


class GetPhotoUseCaseImpl(private val repository: PhotoRepository) {
    suspend operator fun invoke(): List<Photo>{
        return repository.getPhotos()
    }

    suspend operator fun invoke(albumId: Long): List<Photo>{
        return repository.getPhotosFromAlbum(albumId)
    }

    suspend fun getFirstPhoto(photoId: Long): Photo {
        return repository.getPhoto(photoId)
    }

}