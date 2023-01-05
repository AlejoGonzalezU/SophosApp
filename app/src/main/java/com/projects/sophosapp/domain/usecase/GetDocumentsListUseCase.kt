package com.projects.sophosapp.domain.usecase

import com.projects.sophosapp.data.mapper.DocumentsListResponseMapper
import com.projects.sophosapp.data.repository.DocumentsRepository
import com.projects.sophosapp.domain.models.DocumentsListDto

class GetDocumentsListUseCase {
    private val repository = DocumentsRepository()
    private val mapper: DocumentsListResponseMapper = DocumentsListResponseMapper()

    suspend operator fun invoke(email: String): DocumentsListDto {
        return mapper.transform(repository.getDocumentsByEmail(email))
    }
}
