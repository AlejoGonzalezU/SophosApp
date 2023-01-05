package com.projects.sophosapp.domain.usecase

import com.projects.sophosapp.data.mapper.OfficesResponseMapper
import com.projects.sophosapp.data.repository.OfficesRepository
import com.projects.sophosapp.domain.models.OfficesResponseDto

class GetOfficesListUseCase {
    private val repository = OfficesRepository()
    private val mapper = OfficesResponseMapper()

    suspend operator fun invoke(): OfficesResponseDto {
        return mapper.transform(
            repository.getOfficesList()
        )
    }
}
