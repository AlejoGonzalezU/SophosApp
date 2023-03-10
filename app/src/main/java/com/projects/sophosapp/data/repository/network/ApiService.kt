package com.projects.sophosapp.data.repository.network

import com.projects.sophosapp.data.models.request.PutDocumentsRequestEntity
import com.projects.sophosapp.data.models.response.DocumentDetailResponseModel
import com.projects.sophosapp.data.models.response.DocumentsListResponseModel
import com.projects.sophosapp.data.models.response.DocumentsUploadResponseModel
import com.projects.sophosapp.data.models.response.OfficesResponseModel
import com.projects.sophosapp.data.models.response.UsersResponseModel
import com.projects.sophosapp.domain.definitions.Constants.DOCUMENTS
import com.projects.sophosapp.domain.definitions.Constants.OFFICES
import com.projects.sophosapp.domain.definitions.Constants.USERS
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @GET(USERS)
    suspend fun getUserByCredentials(
        @Query("idUsuario") userId: String,
        @Query("clave") key: String
    ): Response<UsersResponseModel>

    @GET(OFFICES)
    suspend fun getOfficesList(): Response<OfficesResponseModel>

    @POST(DOCUMENTS)
    suspend fun postDocumentToRepository(
        @Body putDocumentsRequestEntity: PutDocumentsRequestEntity
    ): Response<DocumentsUploadResponseModel>

    @GET(DOCUMENTS)
    suspend fun getDocumentsByEmail(
        @Query("correo") email: String
    ): Response<DocumentsListResponseModel>

    @GET(DOCUMENTS)
    suspend fun getDocumentsByRegistry(
        @Query("idRegistro") id: String
    ): Response<DocumentDetailResponseModel>
}
