package com.projects.sophosapp.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.projects.sophosapp.domain.models.OfficesResponseDto
import com.projects.sophosapp.domain.usecase.GetOfficesListUseCase
import kotlinx.coroutines.launch

class OfficesViewModel : ViewModel() {
    val officesModel = MutableLiveData<OfficesResponseDto>()
    val isLoading = MutableLiveData<Boolean>()
    private val getOfficesListUseCase = GetOfficesListUseCase()

    fun getOfficesList() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getOfficesListUseCase.invoke()
            officesModel.postValue(result)
            isLoading.postValue(false)
        }
    }
}
