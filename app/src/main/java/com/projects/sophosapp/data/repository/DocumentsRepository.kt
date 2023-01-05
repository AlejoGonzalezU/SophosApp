package com.projects.sophosapp.data.repository

import com.projects.sophosapp.data.models.request.PutDocumentsRequestEntity
import com.projects.sophosapp.data.models.response.DocumentDetailResponseModel
import com.projects.sophosapp.data.models.response.DocumentsListResponseModel
import com.projects.sophosapp.data.models.response.DocumentsUploadResponseModel
import com.projects.sophosapp.data.provider.DocumentsProvider
import com.projects.sophosapp.data.repository.network.DocumentsRemote

class DocumentsRepository {
    private val api = DocumentsRemote()

    suspend fun putDocuments(params: PutDocumentsRequestEntity): DocumentsUploadResponseModel {
        val response = api.putDocuments(params)
        DocumentsProvider.putOperationResult = response
        return response
    }

    suspend fun getDocumentsByEmail(email: String): DocumentsListResponseModel {
        val response = api.getDocumentsByEmail(email)
        DocumentsProvider.getByEmailOperationResult = response
        return response
    }

    suspend fun getDocumentsById(id: String): DocumentDetailResponseModel {
        val response = api.getDocumentsByRegistry(id)
        DocumentsProvider.getByIdOperationResult = response
        return response
    }
}
