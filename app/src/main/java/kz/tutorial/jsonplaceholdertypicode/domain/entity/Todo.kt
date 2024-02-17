package kz.tutorial.jsonplaceholdertypicode.domain.entity

data class Todo(
    val userId: Long,
    val id: Long,
    val title: String,
    var completed: Boolean
)