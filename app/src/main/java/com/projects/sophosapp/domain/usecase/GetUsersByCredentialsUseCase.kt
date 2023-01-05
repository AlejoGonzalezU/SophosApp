package com.projects.sophosapp.domain.usecase

import com.projects.sophosapp.data.mapper.UserResponseMapper
import com.projects.sophosapp.data.models.request.UserRequestEntity
import com.projects.sophosapp.data.repository.UserRepository
import com.projects.sophosapp.domain.models.UserResponseDto

class GetUsersByCredentialsUseCase {
    private val repository = UserRepository()
    private val mapper: UserResponseMapper = UserResponseMapper()

    suspend operator fun invoke(params: UserRequestEntity): UserResponseDto {
        return mapper.transform(
            repository.getUserByCredentials(params)
        )
    }
}
