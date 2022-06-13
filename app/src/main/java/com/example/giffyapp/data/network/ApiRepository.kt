package com.example.giffyapp.data.network

import javax.inject.Inject

class ApiRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getAllGifs() = apiService.getAllGifs()
}