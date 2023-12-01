package com.example.chatterkotlinfrontend

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.request.get
import io.ktor.client.statement.*
import io.ktor.serialization.kotlinx.json.*

object ApiClient {

    private const val BASE_URL = "http://localhost:8080/";

    private val httpClient = HttpClient {
        install(ContentNegotiation){
            json()
        }
    }

    suspend fun getPosts(): List<Post> {
        return httpClient.request(BASE_URL).body()
    }
}