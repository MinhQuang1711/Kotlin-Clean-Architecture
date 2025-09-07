package com.example.kotlincleanarchitecture.features.login.domain.entities

class LoginResponseEntity (
        val fullName: String?,
        val accessToken: String?,
        val refreshToken: String?,
        val permission: PermissionEntity?,
)
