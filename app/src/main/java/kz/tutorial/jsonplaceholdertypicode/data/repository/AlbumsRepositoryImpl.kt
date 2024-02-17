package kz.tutorial.jsonplaceholdertypicode.data.repository

import kz.tutorial.jsonplaceholdertypicode.data.network.MainApi
import kz.tutorial.jsonplaceholdertypicode.domain.entity.Album
import kz.tutorial.jsonplaceholdertypicode.domain.repository.AlbumRepository

class AlbumsRepositoryImpl(private val mainApi: MainApi): AlbumRepository {
    override suspend fun getAlbums(): List<Album> {
        return mainApi.getAlbums()
    }
}