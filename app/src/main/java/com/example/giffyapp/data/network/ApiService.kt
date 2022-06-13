package com.example.giffyapp.data.network

import com.example.giffyapp.data.models.Giffys
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("/shows")
    suspend fun getAllGifs(): Response<List<Giffys>>
}