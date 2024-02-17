package kz.tutorial.jsonplaceholdertypicode.domain.entity

data class Photo (
    val albumId: Long,
    val id: Long,
    val thumbnailUrl: String,
    val title: String,
    val url: String
)