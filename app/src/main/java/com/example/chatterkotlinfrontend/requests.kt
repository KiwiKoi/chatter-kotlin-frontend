package com.example.chatterkotlinfrontend

import io.ktor.client.HttpClient
import io.ktor.client.request.*
import io.ktor.client.engine.cio.*
import io.ktor.client.statement.*



suspend fun fetchDataFromBackend() {
    val client = HttpClient(CIO)
    val response: HttpResponse = client.get("https://ktor.io/")
    println(response.status)
    client.close()
}