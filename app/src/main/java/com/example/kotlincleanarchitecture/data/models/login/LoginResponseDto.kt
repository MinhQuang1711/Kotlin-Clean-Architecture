package com.example.kotlincleanarchitecture.data.models.login

import com.example.kotlincleanarchitecture.data.models.login.PermissonDto
import com.google.gson.annotations.SerializedName

class LoginResponseDto (
    @SerializedName("FullName") val fullName: String?,
    @SerializedName("AccessToken") val accessToken: String?,
    @SerializedName("RefreshToken") val refreshToken: String?,
    @SerializedName("Permission") val permission: PermissonDto?,
)