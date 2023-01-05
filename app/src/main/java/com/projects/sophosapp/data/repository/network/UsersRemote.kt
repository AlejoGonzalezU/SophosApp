package com.projects.sophosapp.data.repository.network

import com.projects.sophosapp.core.RetrofitHelper
import com.projects.sophosapp.data.models.request.UserRequestEntity
import com.projects.sophosapp.data.models.response.UsersResponseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UsersRemote {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getUserInfo(params: UserRequestEntity): UsersResponseModel {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(ApiService::class.java).getUserByCredentials(params.userId, params.key)
            response.body() ?: UsersResponseModel()
        }
    }
}
