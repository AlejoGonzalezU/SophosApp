package com.projects.sophosapp.domain.usecase

import com.projects.sophosapp.data.models.request.PutDocumentsRequestEntity
import com.projects.sophosapp.data.models.response.DocumentsUploadResponseModel
import com.projects.sophosapp.data.repository.DocumentsRepository

class UploadDocumentsUseCase {
    private val repository = DocumentsRepository()

    suspend operator fun invoke(params: PutDocumentsRequestEntity): DocumentsUploadResponseModel {
        return repository.putDocuments(params)
    }
}
