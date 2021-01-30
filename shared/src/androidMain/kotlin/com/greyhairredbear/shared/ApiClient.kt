package com.greyhairredbear.shared

import io.ktor.client.HttpClient

class ApiClient {
    private val client = HttpClient()

    suspend fun fetch(): String {
        return ""
    }
}
