package com.example.kotlincleanarchitecture.data.models.login

import com.google.gson.annotations.SerializedName

class LoginRequestDto (
    @SerializedName("Username") val username: String?,
    @SerializedName("Password") val password: String?,
)