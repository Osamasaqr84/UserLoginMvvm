package com.noname.login.domain.usecases

import com.noname.login.domain.Repository
import com.noname.login.models.LoginResponse
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LoginUseCase @Inject constructor(private val repository: Repository) {


    suspend fun invoke(userName:String,passWord :String) : LoginResponse {
        return repository.login(userName,passWord).also {
            it.token = null
        }
    }

}