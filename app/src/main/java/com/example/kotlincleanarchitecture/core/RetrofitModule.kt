package com.example.kotlincleanarchitecture.core

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitModule {

    fun load(client: OkHttpClient) : Retrofit {
        val retrofit = Retrofit.Builder()
            .client(client)
            .baseUrl(AppConfiguration.SERVER_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }
}