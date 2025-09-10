package com.example.kotlincleanarchitecture.core

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object OkHttpModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(AppConfiguration.TIME_OUT, TimeUnit.SECONDS)
            .callTimeout(AppConfiguration.TIME_OUT, TimeUnit.SECONDS)
            .build()
    }
}
