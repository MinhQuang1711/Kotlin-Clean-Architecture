package com.example.kotlincleanarchitecture.data.sources.remotes

import com.example.kotlincleanarchitecture.data.models.login.LoginRequestDto
import com.example.kotlincleanarchitecture.data.models.login.LoginResponseDto
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApiService {
    @POST("login")
    suspend fun login(@Body param: LoginRequestDto) : LoginResponseDto
}