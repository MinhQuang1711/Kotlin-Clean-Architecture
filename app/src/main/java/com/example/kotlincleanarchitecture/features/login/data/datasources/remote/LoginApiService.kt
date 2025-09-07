package com.example.kotlincleanarchitecture.features.login.data.datasources.remote

import com.example.kotlincleanarchitecture.features.login.data.models.LoginRequestDto
import com.example.kotlincleanarchitecture.features.login.data.models.LoginResponseDto
import retrofit2.Retrofit
import retrofit2.http.POST

interface LoginApiService {
    @POST("login")
    suspend fun login(param: LoginRequestDto) : LoginResponseDto
}