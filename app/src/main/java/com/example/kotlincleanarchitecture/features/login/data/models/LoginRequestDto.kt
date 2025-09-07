package com.example.kotlincleanarchitecture.features.login.data.models

import com.google.gson.annotations.SerializedName

class LoginRequestDto (
    @SerializedName("Username") val username: String?,
    @SerializedName("Password") val password: String?,
)