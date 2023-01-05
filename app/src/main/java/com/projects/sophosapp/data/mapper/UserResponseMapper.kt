package com.projects.sophosapp.data.mapper

import com.projects.sophosapp.data.models.response.UsersResponseModel
import com.projects.sophosapp.domain.models.UserResponseDto

class UserResponseMapper {
    fun transform(value: UsersResponseModel): UserResponseDto {
        return UserResponseDto(
            id = value.id,
            name = value.name,
            lastName = value.lastName,
            access = value.access,
            admin = value.admin
        )
    }
}
