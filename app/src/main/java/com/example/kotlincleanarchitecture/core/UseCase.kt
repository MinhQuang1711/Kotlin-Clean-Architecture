package com.example.kotlincleanarchitecture.core

interface UseCase<Param, Result> {
    suspend fun call(param: Param) : Result
}