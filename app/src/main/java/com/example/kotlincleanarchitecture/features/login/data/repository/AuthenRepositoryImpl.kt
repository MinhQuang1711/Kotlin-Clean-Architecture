package com.example.kotlincleanarchitecture.features.login.data.repository

import com.example.kotlincleanarchitecture.features.login.data.datasources.remote.LoginApiService
import com.example.kotlincleanarchitecture.features.login.data.models.LoginRequestDto
import com.example.kotlincleanarchitecture.features.login.domain.entities.LoginRequestEntity
import com.example.kotlincleanarchitecture.features.login.domain.entities.LoginResponseEntity
import com.example.kotlincleanarchitecture.features.login.domain.entities.PermissionEntity
import com.example.kotlincleanarchitecture.features.login.domain.repository.AuthenRepository

class AuthenRepositoryImpl (val apiService: LoginApiService) : AuthenRepository{
    override suspend fun login(param: LoginRequestEntity): LoginResponseEntity {
        /* TODO: flow implemnt logic for repository
            - Step 1: mapping `param entity` to `param dto`
            - Step 2: use `apiService` call to method
            - Step 3: convert `response dto` to `response entity` and return it
        */

        ///  mapping `param entity` to `param dto`
        //
        val loginRequestDto = LoginRequestDto(
            param.username,
            param.password,
        )

        val loginResponseDto = apiService.login(loginRequestDto)
        val permissonDto = loginResponseDto.permission

        /// convert `response dto` to `response entity`
        //
        val loginResponseEntity = LoginResponseEntity(
            fullName =loginResponseDto.fullName,
            accessToken= loginResponseDto.accessToken,
            refreshToken= loginResponseDto.refreshToken,
            permission= PermissionEntity(
                permissonDto?.hasAllowViewProduct,
                permissonDto?.hasAllowCreateProduct,
                permissonDto?.hasAllowUpdateProduct,
                permissonDto?.hasAllowDeleteProduct,
                permissonDto?.hasAllowViewInvoice,
                permissonDto?.hasAllowCreateInvoice,
                permissonDto?.hasAllowUpdateInvoice,
                permissonDto?.hasAllowDeleteInvoice
            )
        )

        return loginResponseEntity;
    }
}