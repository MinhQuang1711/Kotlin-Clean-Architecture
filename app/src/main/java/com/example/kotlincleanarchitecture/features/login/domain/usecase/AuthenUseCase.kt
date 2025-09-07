package com.example.kotlincleanarchitecture.features.login.domain.usecase

import com.example.kotlincleanarchitecture.core.UseCase
import com.example.kotlincleanarchitecture.features.login.domain.entities.LoginRequestEntity
import com.example.kotlincleanarchitecture.features.login.domain.entities.LoginResponseEntity

interface AuthenUseCase : UseCase<LoginRequestEntity, Result<LoginResponseEntity>>