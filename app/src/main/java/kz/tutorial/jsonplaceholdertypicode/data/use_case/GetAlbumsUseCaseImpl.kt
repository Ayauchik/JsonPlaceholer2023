package kz.tutorial.jsonplaceholdertypicode.data.use_case

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Album
import kz.tutorial.jsonplaceholdertypicode.domain.repository.AlbumRepository

class GetAlbumsUseCaseImpl(private val repository: AlbumRepository) {
    suspend operator fun invoke(): List<Album>{
        return repository.getAlbums()
    }
}