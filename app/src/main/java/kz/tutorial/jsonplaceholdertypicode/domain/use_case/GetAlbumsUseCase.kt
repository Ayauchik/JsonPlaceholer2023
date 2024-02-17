package kz.tutorial.jsonplaceholdertypicode.domain.use_case

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Album
import kz.tutorial.jsonplaceholdertypicode.domain.repository.AlbumRepository

interface GetAlbumsUseCase {
    suspend operator fun invoke(): List<Album>
}