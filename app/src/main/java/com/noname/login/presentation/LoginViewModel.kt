package com.noname.login.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.noname.login.domain.usecases.LoginUseCase
import com.noname.login.models.LoginResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(val loginUseCase: LoginUseCase) : ViewModel() {

    val loginFlow: MutableStateFlow<LoginResponse?> = MutableStateFlow(null)

    fun loginUser(userName:String,pass:String) {
        viewModelScope.launch(Dispatchers.IO) {
           val response = loginUseCase.invoke(userName,pass)
            loginFlow.emit(response)
        }
    }

}