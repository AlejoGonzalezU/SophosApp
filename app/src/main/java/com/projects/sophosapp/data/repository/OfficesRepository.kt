package com.projects.sophosapp.data.repository

import com.projects.sophosapp.data.models.response.OfficesResponseModel
import com.projects.sophosapp.data.provider.OfficesProvider
import com.projects.sophosapp.data.repository.network.OfficesRemote

class OfficesRepository {
    private val api = OfficesRemote()

    suspend fun getOfficesList(): OfficesResponseModel {
        val response = api.getOfficesInfo()
        OfficesProvider.offices = response
        return response
    }
}
