package com.example.kotlincleanarchitecture.domain.usecases

import com.example.kotlincleanarchitecture.core.UseCase
import com.example.kotlincleanarchitecture.domain.entities.login.LoginRequestEntity
import com.example.kotlincleanarchitecture.domain.entities.login.LoginResponseEntity

interface AuthenUseCase : UseCase<LoginRequestEntity, Result<LoginResponseEntity>>