package com.projects.sophosapp.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.projects.sophosapp.data.models.request.UserRequestEntity
import com.projects.sophosapp.domain.models.UserResponseDto
import com.projects.sophosapp.domain.usecase.GetUsersByCredentialsUseCase
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {
    val userModel = MutableLiveData<UserResponseDto>()
    val isLoading = MutableLiveData<Boolean>()
    private val getUsersByCredentialsUseCase = GetUsersByCredentialsUseCase()

    fun getUserByCredentials(params: UserRequestEntity) {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getUsersByCredentialsUseCase.invoke(params)
            userModel.postValue(result)
            isLoading.postValue(false)
        }
    }
}
