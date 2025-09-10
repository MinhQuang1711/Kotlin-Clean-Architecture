package com.example.kotlincleanarchitecture.domain.entities.login

import com.example.kotlincleanarchitecture.domain.entities.login.PermissionEntity

class LoginResponseEntity (
    val fullName: String?,
    val accessToken: String?,
    val refreshToken: String?,
    val permission: PermissionEntity?,
)