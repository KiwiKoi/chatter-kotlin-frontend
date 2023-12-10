package com.example.chatterkotlinfrontend

import kotlinx.serialization.Serializable
import java.time.LocalDateTime
import java.util.Date

@Serializable
data class Post(
    val id: String,
    val title: String,
    val body: String,
    val image: String?,
    val createdAt: LocalDateTime?,
    val updatedAt: LocalDateTime?,
    val published: Boolean?,
    val author: User?,
    val user_id: String?,
)
