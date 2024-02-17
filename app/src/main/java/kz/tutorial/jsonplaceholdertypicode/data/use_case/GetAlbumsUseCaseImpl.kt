package kz.tutorial.jsonplaceholdertypicode.data.use_case

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Album
import kz.tutorial.jsonplaceholdertypicode.domain.repository.AlbumRepository
import kz.tutorial.jsonplaceholdertypicode.domain.use_case.GetAlbumsUseCase

class GetAlbumsUseCaseImpl(private val repository: AlbumRepository): GetAlbumsUseCase {
    override suspend operator fun invoke(): List<Album>{
        return repository.getAlbums()
    }
}