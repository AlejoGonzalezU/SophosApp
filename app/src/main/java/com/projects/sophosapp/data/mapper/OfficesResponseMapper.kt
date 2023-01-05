package com.projects.sophosapp.data.mapper

import com.projects.sophosapp.data.models.response.OfficeModel
import com.projects.sophosapp.data.models.response.OfficesResponseModel
import com.projects.sophosapp.domain.models.OfficeDto
import com.projects.sophosapp.domain.models.OfficesResponseDto

class OfficesResponseMapper {
    fun transform(value: OfficesResponseModel): OfficesResponseDto {
        return OfficesResponseDto(
            items = transformOfficesModelList(value.items),
            count = value.count,
            scannedCount = value.scannedCount
        )
    }

    private fun transformOfficesModelList(officesList: List<OfficeModel>): List<OfficeDto> {
        return officesList.map { transformOfficesModel(it) }
    }

    private fun transformOfficesModel(office: OfficeModel): OfficeDto {
        return OfficeDto(
            city = office.city,
            longitude = office.longitude,
            id = office.id,
            latitude = office.latitude,
            name = office.name
        )
    }
}
