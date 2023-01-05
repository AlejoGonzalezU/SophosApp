package com.projects.sophosapp.domain.usecase

import com.projects.sophosapp.data.mapper.DocumentDetailResponseMapper
import com.projects.sophosapp.data.repository.DocumentsRepository
import com.projects.sophosapp.domain.models.DocumentDetailDto

class GetDocumentDetailUseCase {
    private val repository = DocumentsRepository()
    private val mapper = DocumentDetailResponseMapper()

    suspend operator fun invoke(id: String): DocumentDetailDto {
        return mapper.transform(repository.getDocumentsById(id))
    }
}
