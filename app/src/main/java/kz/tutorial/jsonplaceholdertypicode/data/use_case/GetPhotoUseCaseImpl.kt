package kz.tutorial.jsonplaceholdertypicode.data.use_case

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Photo
import kz.tutorial.jsonplaceholdertypicode.domain.repository.PhotoRepository
import kz.tutorial.jsonplaceholdertypicode.domain.use_case.GetPhotosUseCase


class GetPhotoUseCaseImpl(private val repository: PhotoRepository): GetPhotosUseCase {
    override suspend operator fun invoke(): List<Photo>{
        return repository.getPhotos()
    }

    override suspend operator fun invoke(albumId: Long): List<Photo>{
        return repository.getPhotosFromAlbum(albumId)
    }

    override suspend fun getFirstPhoto(photoId: Long): Photo {
        return repository.getPhoto(photoId)
    }

}