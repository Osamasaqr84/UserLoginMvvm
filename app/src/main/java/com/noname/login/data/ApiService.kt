package com.noname.login.data

import com.noname.login.models.LoginResponse
import retrofit2.http.GET

interface ApiService {

    @GET("")
    suspend fun loginUser() : LoginResponse
}