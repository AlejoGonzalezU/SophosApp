package com.projects.sophosapp.data.provider

import com.projects.sophosapp.data.models.response.DocumentDetailResponseModel
import com.projects.sophosapp.data.models.response.DocumentsListResponseModel
import com.projects.sophosapp.data.models.response.DocumentsUploadResponseModel

class DocumentsProvider {
    companion object {
        var putOperationResult: DocumentsUploadResponseModel = DocumentsUploadResponseModel()
        var getByEmailOperationResult: DocumentsListResponseModel = DocumentsListResponseModel()
        var getByIdOperationResult: DocumentDetailResponseModel = DocumentDetailResponseModel()
    }
}
