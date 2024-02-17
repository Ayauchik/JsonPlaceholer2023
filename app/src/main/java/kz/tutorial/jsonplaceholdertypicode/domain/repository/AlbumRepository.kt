package kz.tutorial.jsonplaceholdertypicode.domain.repository

import kz.tutorial.jsonplaceholdertypicode.domain.entity.Album

interface AlbumRepository {
    suspend fun getAlbums(): List<Album>
}