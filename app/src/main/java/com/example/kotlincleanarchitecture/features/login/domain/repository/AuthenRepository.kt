package com.example.kotlincleanarchitecture.features.login.domain.repository

import com.example.kotlincleanarchitecture.features.login.domain.entities.LoginRequestEntity
import com.example.kotlincleanarchitecture.features.login.domain.entities.LoginResponseEntity

interface AuthenRepository {
    suspend fun login(param: LoginRequestEntity) : LoginResponseEntity
}