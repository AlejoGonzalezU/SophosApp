package com.projects.sophosapp.data.repository

import com.projects.sophosapp.data.models.request.UserRequestEntity
import com.projects.sophosapp.data.models.response.UsersResponseModel
import com.projects.sophosapp.data.provider.UserProvider
import com.projects.sophosapp.data.repository.network.UsersRemote

class UserRepository {
    private val api = UsersRemote()

    suspend fun getUserByCredentials(params: UserRequestEntity): UsersResponseModel {
        val response = api.getUserInfo(params)
        UserProvider.users = response
        return response
    }
}
