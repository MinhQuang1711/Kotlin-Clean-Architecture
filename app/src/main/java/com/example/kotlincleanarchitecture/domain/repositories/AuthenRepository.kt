package com.example.kotlincleanarchitecture.domain.repositories

import com.example.kotlincleanarchitecture.domain.entities.login.LoginRequestEntity
import com.example.kotlincleanarchitecture.domain.entities.login.LoginResponseEntity

interface AuthenRepository {
    suspend fun login(param: LoginRequestEntity) : LoginResponseEntity
}