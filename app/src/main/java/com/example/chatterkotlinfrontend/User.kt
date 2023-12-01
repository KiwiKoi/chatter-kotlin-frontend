package com.example.chatterkotlinfrontend

data class User(
    val id: String,
    val username: String?,
    val email: String?,
    val firstname: String?,
    val lastname: String?,
    val posts: MutableList<Post>,
)
