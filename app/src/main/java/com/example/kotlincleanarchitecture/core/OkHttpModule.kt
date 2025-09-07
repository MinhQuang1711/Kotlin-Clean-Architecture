package com.example.kotlincleanarchitecture.core


import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

object OkHttpModule {
    fun load() : OkHttpClient{
        val client = OkHttpClient.Builder()
            .readTimeout(AppConfiguration.TIME_OUT, TimeUnit.SECONDS)
            .callTimeout(AppConfiguration.TIME_OUT, TimeUnit.SECONDS)
            .build()
        return client
    }
}