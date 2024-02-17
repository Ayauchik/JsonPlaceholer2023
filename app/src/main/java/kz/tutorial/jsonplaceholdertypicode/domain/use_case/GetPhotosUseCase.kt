package kz.tutorial.jsonplaceholdertypicode.domain.use_case

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Photo
import kz.tutorial.jsonplaceholdertypicode.domain.repository.PhotoRepository

interface GetPhotosUseCase {
    suspend operator fun invoke(): List<Photo>
    suspend operator fun invoke(albumId: Long): List<Photo>
    suspend fun getFirstPhoto(photoId: Long): Photo

}