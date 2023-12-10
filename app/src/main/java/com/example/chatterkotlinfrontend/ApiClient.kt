package com.example.chatterkotlinfrontend

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.client.request.get
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject

object ApiClient {

    private const val BASE_URL = "http://192.168.1.23:8080/";

    private val client = HttpClient {
        install(ContentNegotiation){
            json()
        }
    }

    suspend fun getPosts() {
        return client.request(BASE_URL + "posts").body()
    }
}