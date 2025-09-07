package com.example.kotlincleanarchitecture.features.login.data.usecase

import android.util.Log
import com.example.kotlincleanarchitecture.features.login.domain.entities.LoginRequestEntity
import com.example.kotlincleanarchitecture.features.login.domain.entities.LoginResponseEntity
import com.example.kotlincleanarchitecture.features.login.domain.repository.AuthenRepository
import com.example.kotlincleanarchitecture.features.login.domain.usecase.AuthenUseCase

class AuthenUsecaseImpl(val repository: AuthenRepository) : AuthenUseCase {
    override suspend fun call(param: LoginRequestEntity): Result<LoginResponseEntity> {
       try
       {
            val loginResponseEntity = repository.login(param)
           return Result.success(loginResponseEntity)
       }
       catch(exception: Exception)
       {
           Log.e("Authentication exception", exception.toString())
           return Result.failure(exception)
       }
    }
}